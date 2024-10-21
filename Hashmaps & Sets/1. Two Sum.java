class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         HashMap<Integer,Integer> hello = new HashMap<>();
        for (int i=0; i<nums.length ; i++){
            hello.put(nums[i],i);
        }
        for(int i=0; i<nums.length ; i++)  {
            int comp =  target - nums[i] ;
            if(hello.containsKey(comp) && hello.get(comp) != i) {
                return new int[]{i,hello.get(comp)};
            }          
        }
        return new int[]{};     
        }      
    }
// more optimized solution

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            
             HashMap<Integer,Integer> hello = new HashMap<>();
            for (int i=0; i<nums.length ; i++){
                int comp =  target - nums[i] ;
                if(hello.containsKey(comp)) return new int[]{i,hello.get(comp)};
                hello.put(nums[i],i);         
            }
            return new int[]{};     
            }      
        }
    