class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int r =0;
        for(int i : gain) { 
            r+=i;
            if(r>max) max=r;
        }
        return max;
    }
}