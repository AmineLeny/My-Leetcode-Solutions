class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        int dp[] = new int[n];
        int max =Integer.MIN_VALUE;
        for ( int i =0 ; i<n ; ++i ) {
            dp[i] = nums[i];
                for ( int j = 0; j<=i-2 ; ++j ) {
                    dp[i] = Math.max(dp[i],dp[j]+nums[i]);
                }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
   
    }
