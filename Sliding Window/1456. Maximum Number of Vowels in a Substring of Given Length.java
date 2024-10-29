class Solution {
    public int maxVowels(String s, int k) {
        int n =s.length();
        int i = 0 , j = k-1 ;
        Set<Character> v = new HashSet<>();
        String vowel = "aeiou";
        int result = 0 , max = 0 ;
        if(n==0) return 0;
        for( int h =0 ; h< vowel.length() ; ++h) {
            v.add(vowel.charAt(h));
        }

        for(int h=0; h<k ; ++h) {
            if(v.contains( s.charAt(h) )) result+=1;
        }
        max=result;
        j++;
        while(j<n) {
            if( (v.contains(s.charAt(j))) ) result+=1;
            if(v.contains(s.charAt(i))) result-=1;
            if(result>max) max=result;
            j++;
            i++;

        }
        return max;
    }
}