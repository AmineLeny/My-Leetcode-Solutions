1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for ( int s : stones ) pq.add(s);
5        while ( pq.size()>=2) { 
6            int a = pq.poll();
7            int b = pq.poll();
8            if ( a != b ) pq.add(a-b);
9
10        }
11        return pq.isEmpty() ? 0: pq.peek();
12    }
13}