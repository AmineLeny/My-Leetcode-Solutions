class Solution {
    public String longestPalindrome(String s) {

        String res =String.valueOf(s.charAt(0));

        for ( int i = 0 ; i< s.length() ; ++i ) { 
            int start = i , end = i ;
            int resS =i,resE=i;
            while (start>-1 && end<s.length() && s.charAt(start)==s.charAt(end)) {
                resS=start;
                resE=end;
                start--;
                end++;
            }
         
            if( resE-resS+1 > res.length() ) {
                res = s.substring(resS,resE+1);     
            }

            start =i;
            end = i+1;
            resS = i;
            resE = i;
            while (start>-1 && end<s.length() && s.charAt(start)==s.charAt(end)) {
                resS=start;
                resE=end;
                start--;
                end++;
            }
         
            if( resE-resS+1 > res.length() ) {
                res = s.substring(resS,resE+1);     
            }




        }
        return res;
        
    }
}