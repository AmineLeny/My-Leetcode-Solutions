class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0; 
        int j = n-1;
        while ( i < j ){
            if( numbers[j]+numbers[i]> target){
                j--;
            }
            else if ( numbers[j]+numbers[i]<target){
                i++;
            }
            else {
                break;
            }
        }
        return new int[]{i+1,j+1};

    }

}