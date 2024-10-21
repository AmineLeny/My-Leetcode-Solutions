class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character,Integer> as = new HashMap<>();
        int ml = magazine.length();
        int rl = ransomNote.length();

        for(int i = 0 ; i<ml ; ++i){
            if(as.containsKey(magazine.charAt(i))) as.put(magazine.charAt(i),as.get(magazine.charAt(i))+1);
            else as.put(magazine.charAt(i),1);
        }
        for(int i =0 ; i<rl ; ++i){
            if(! (as.containsKey(ransomNote.charAt(i))) || as.get(ransomNote.charAt(i))<1){
                return false;
            }
             as.put(ransomNote.charAt(i), as.get(ransomNote.charAt(i))-1);
        }
        return true;
        
    }
}