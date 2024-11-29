class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentConsecutiveOnes = 0;
        int  max = 0;
        for ( int i: nums) {
            currentConsecutiveOnes +=1;
            if( i != 1) currentConsecutiveOnes =0;
            if(max< currentConsecutiveOnes) max = currentConsecutiveOnes;
        }
        return max;

        
    }
}