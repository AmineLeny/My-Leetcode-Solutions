class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] alphabets = new int[26];
        int n = text.length();
        int r = 0;
        int c = n;
        String balloon = "balloon";
        for ( int i =0 ; i<n ; ++i ) {
            alphabets[text.charAt(i)- 'a']++;
        }
        while (c>6) { 
            for(int i = 0 ; i<7 ; ++i){
            if(alphabets[balloon.charAt(i)-'a'] == 0 ) return r;
            alphabets[balloon.charAt(i)-'a']--;
            c--;
        }
        r++;   
        }
        return r;     
    }
}