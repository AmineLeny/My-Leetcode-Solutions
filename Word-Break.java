class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()+1];
        dp[0]=1;

        for( int i =1 ; i<=s.length() ; ++i ) { 
            for( String w :wordDict ){
                if (i-w.length()>= 0 ){
                    
                    if(dp[i-w.length()] == 1 && s.substring(i-w.length(),i).equals(w)){
                        dp[i]= 1;
                    }
                }
            }
        }
        for ( int d : dp) System.out.print(d +"|");
        return dp[s.length()]==1;
    }
}