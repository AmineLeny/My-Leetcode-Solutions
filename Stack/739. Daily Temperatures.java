class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
        int[] as = new int[n];
        int j = n-1;
        while ( j >=0 ) { 
            if  (s.isEmpty() ) {
               as[j] = 0;
               s.push(j);
               j--;
            }
             if ( temperatures[j] < temperatures[s.peek()] )  {
                as[j] = s.peek()- j;
                s.push(j);
                j--;
            }
            else {
                s.pop();
            }
        }
        return as ;

        
    }
}