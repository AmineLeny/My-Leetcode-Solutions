class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> back = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>(); 
        Arrays.sort(candidates);
        back(candidates, 0, target,0, back, res );
        return res;
    }

    public void back(int[] candidates, int sum , int target, int j , List<Integer> back , List<List<Integer>> res ) { 

        if ( sum > target ) return ;
        if(sum == target) res.add(new ArrayList<>(back));
        for( int i = j ; i< candidates.length ; ++i ) { 
            back.add(candidates[i]);
            back(candidates, sum+candidates[i], target,i+1, back, res );
            back.remove(back.size()-1);
          
            while(i+1<candidates.length && i+1>0 && candidates[i+1]== candidates[i] ) i++;

        }

    }
}