class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanMap = new HashMap<>();
        char[] romanNumerals = {'I','V','X','L','C','D','M'};
        int[] romanValues = {1,5,10,50,100,500,1000};
        for (int i =0; i<7 ; i++){
            romanMap.put(romanNumerals[i],romanValues[i]);
        }
        int prev = romanMap.get(s.charAt(0));
        int valueInt=prev;
        for( int i =1 ; i< s.length() ; i++){
           if( romanMap.get(s.charAt(i))>prev){
            valueInt += romanMap.get(s.charAt(i)) - (2*prev);
           }
            else valueInt += romanMap.get(s.charAt(i));
            prev = romanMap.get(s.charAt(i));
        }
        return valueInt;
    }
}