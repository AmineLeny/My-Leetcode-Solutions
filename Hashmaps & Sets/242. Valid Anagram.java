class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int sl = s.length();
        int tl = t.length();
        if(sl!=tl) return false;
        for (int i = 0 ; i<sl ; ++i ) {
            a[s.charAt(i)-'a']++; a[t.charAt(i)-'a']--;
            }
        for(int i : a) if(i != 0) return false;
        return true;
    
        
    }
}