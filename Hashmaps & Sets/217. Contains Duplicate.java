class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> as = new HashMap<>();
        int n = nums.length;
        for(int i =0 ; i<n ; ++i) {
            if(as.containsKey(nums[i])) { 
                return true;
            }
            as.put(nums[i],i);

        }
        return false;

        
    }
}
   
   
   
   
    

   