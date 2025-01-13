class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
                List<List<Integer>> result = new ArrayList<>();
                List<Integer> back =  new ArrayList<>();
                Arrays.sort(candidates);
                backtrack( candidates,target,result,  back ,  0 , 0);
                return result;
            
        }
        public void backtrack(int[] candidates ,int target,List<List<Integer>> result, List<Integer> back , int j , int sum) {     
                    if ( sum == target ) {
                            result.add(new ArrayList<>(back)); 
                            return ; 
                        }
                   else  if ( j >= candidates.length  || sum > target) return ; 
                        back.add(candidates[j]);
                        backtrack( candidates,target,result,  back ,  j+1 , sum+candidates[j]);
                        back.remove(back.size()-1);
                         while( j+1<candidates.length && candidates[j]==candidates[j+1])  { 
    
                        j++;
                         }
                        backtrack( candidates,target,result,  back ,  j+1 , sum);}
    }
    
    
                     
    
                    
        
    