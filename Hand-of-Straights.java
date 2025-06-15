class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        Map<Integer,Integer> occ = new HashMap<>();
        if( n%groupSize != 0 ) return false;
        for (int h : hand) occ.put(h, occ.getOrDefault(h,0)+1);
        Arrays.sort(hand);
        for( int h : hand ) {
            if(occ.get(h)<=0 )continue;
            int tmp = h;
            for ( int i = 0 ; i<groupSize;++i) {
                if(occ.getOrDefault(tmp,0)<= 0 ) return false;
                occ.put(tmp, occ.get(tmp)-1);
                tmp++;
            }
        }
        return true;
    }
}