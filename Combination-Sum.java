class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> back = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates,back,res,target,0,0);
        return res;
    }

    public void dfs( int[] candidates, List<Integer> back, List<List<Integer>> res , int target , int j, int sum ) {
        if(sum>target) return;
        if( sum== target ) {res.add(new ArrayList<>(back));return;}
        for( int i = j ; i < candidates.length; ++i ) { 
            back.add(candidates[i]);
            dfs(candidates,back,res,target,i,sum+candidates[i]);
            back.remove(back.size()-1);

        }
    }
}