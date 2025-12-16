1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> {
4            return (a[0]*a[0]+a[1]*a[1] - b[0]*b[0] -b[1]*b[1]);
5        });
6
7        for ( int[] p : points ) {
8            pq.add(p);
9        }
10        int[][] result = new int[k][2];
11        int v =0;
12        while (v<k) {
13            int[] tmp = pq.poll();
14            result[v][0] = tmp[0];
15            result[v][1]= tmp[1];
16            v++;     
17            }
18        return result;
19    }
20}