class Solution {
    public int firstMissingPositive(int[] nums) {

        int l = 1 ;
        Set<Integer> check =  new HashSet<>();
        for (int i : nums) { 
            check.add(i);

        }

        for ( int i =0 ; i< check.size() ; ++i ) { { 
            if(check.contains(l)) l++;
            else break;
        } 

        }
        return l ;
        
    }
}