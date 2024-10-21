class Solution {
    public int[][] merge(int[][] intervals) {
       int n = intervals.length;
       List<int[]> answer = new ArrayList<>();
       Arrays.sort(intervals, (a,b)->a[0]-b[0]);

       for (int i =0 ; i<n ; ++i){
        int[] last = {intervals[i][0],intervals[i][1]};
        while( i+1< n && last[1] >= intervals[i+1][0]) {
            last[1] = Math.max(last[1] , intervals[i+1][1]);
            ++i;
        }
        answer.add(last);


       }
       return answer.toArray(new int[answer.size()][2]); 
    }
}