class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> back = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        backtrack(back,nums,0,result);
        return result;
    }


    public void backtrack( List<Integer> back , int[] nums, int index , List<List<Integer>> result ) {
       

        for( int i =index ; i< nums.length ; ++i) { 
            back.add(nums[i]);
            result.add(new ArrayList<>(back));
            backtrack(back,nums,i+1,result);
            back.remove(back.size()-1);
        }

    }
}