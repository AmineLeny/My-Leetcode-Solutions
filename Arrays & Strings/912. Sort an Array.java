class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
        
    }
    public int[] mergeSort(int[] nums, int l , int r )  {
        if( l ==r ) return nums ;
        int m = (l+r)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,m,r);
        return nums;
    }
    public void merge(int[] nums, int l, int m ,int r) { 
        int[] left = Arrays.copyOfRange(nums,l,m+1);
        int[] right = Arrays.copyOfRange(nums,m+1,r+1);

        int i =l , j=0,k=0;
        while(j<left.length && k<right.length) { 
            if(left[j]<=right[k]){
                 nums[i]=left[j];
                 j++;
                 }
            else if(left[j]>right[k]) {
                nums[i] = right[k];
                k++;}
            i++;
        }

        while(j<left.length)  {
            nums[i]=left[j];
            j++;
            i++;
            }



        while(k<right.length) {
            nums[i] = right[k];
            i++;
            k++;
            
            }



        


    }
}