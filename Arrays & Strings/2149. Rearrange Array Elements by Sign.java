class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p =0;
        int n=1;
        int l = nums.length;
        int[] r = new int[l];
        int k =0;
        for( int i = 0 ; i< l ; ++i) { 
            if(  nums[i]>=0 ){
                 r[p] = nums[i];
                 p+=2;
                 }
            else  {
                r[n] = nums[i];
                n+=2;
            }
        }
            

            
        
        

        return r;


    }
}