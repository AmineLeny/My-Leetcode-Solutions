class Solution {
    public int findDuplicate(int[] nums) {
        int res= 0;
        for( int i = 0 ; i < nums.length ; ++i ) { 
            if( nums[nums[0]] == -1) {
                res = nums[0] ;
                break;
                 }
            int t = nums[nums[0]];
            nums[nums[0]] =-1 ;
            nums[0] = t;
            
        }
        return res;
    }
}