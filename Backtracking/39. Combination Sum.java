class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> r = new ArrayList<>();
         List<Integer> back = new ArrayList<>();
         backtrack(candidates, target , back, r, 0 , 0);
         return r;
    }
public void backtrack(int[] candidates, int target ,List<Integer> back,List<List<Integer>> r, int j , int sum) { 
    if(j>= candidates.length || sum>target) return;
    if(sum == target ) r.add(new ArrayList<>(back));
    if ( sum < target ) { 
        back.add(candidates[j]);
        backtrack(candidates, target, back, r, j , sum+candidates[j]);
        back.remove(back.size()-1);
        backtrack(candidates, target , back , r ,j+1, sum);
    }
}
}