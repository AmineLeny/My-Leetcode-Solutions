class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] copyNums = nums.clone();
        for ( int i = 0 ; i < n ; ++i ) { 
            nums[(i+k)% n] = copyNums[i];

        }
        
    }
}