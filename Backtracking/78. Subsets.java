class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> back = new ArrayList<>();
        result.add(new ArrayList<>(back));
        backtrack(nums, result, back , 0 );
        
        return result;
        
        
        }

        public void backtrack(int[] nums, List<List<Integer>> result , List<Integer> back , int j) { 
        
        if(j>= nums.length) return;
        back.add(nums[j]);
        result.add(new ArrayList<>(back));
        backtrack(nums, result, back , j+1 );
        back.remove(back.size()-1);
        backtrack(nums, result, back , j+1 );


        }
}