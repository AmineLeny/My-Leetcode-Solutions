class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int n = nums.length;
        double sum = 0;
        double result = 0;
        
        for ( int i =0 ; i<k ; ++i){
            sum+= nums[i];
        }
        
        result = sum;
        for (int i = k ; i<n ; ++i) { 
            sum+= nums[i] - nums[i-k];
            result = Math.max(sum,result);
            
        }
        return result/k;
            
    }
}