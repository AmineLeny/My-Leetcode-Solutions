class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabets = new int[26];

        for(char a : magazine.toCharArray()){
            alphabets[a -'a']++;
        }
        for(char b : ransomNote.toCharArray()){
            if ( alphabets[b-'a'] == 0) return false;
            alphabets[b-'a']--;

        }
        return true;

        
    }
}