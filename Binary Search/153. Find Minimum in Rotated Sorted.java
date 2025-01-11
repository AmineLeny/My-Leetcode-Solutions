class Solution {
    public int findMin(int[] nums) {
       int n = nums.length;
       int s =0 ,e=n-1;
       int min = nums[0];
       while(s<=e ) { 
        int m = (s+e)/2;
        if (nums[s] <= nums[m] ){
            if(nums[s]<min) min= nums[s];
            s= m+1;
        }
        else  {
            if(nums[m]<min) min=nums[m];
            e=m-1;
        }
       }
        return min;
    }
}