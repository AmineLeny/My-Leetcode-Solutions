class KthLargest {
    PriorityQueue<Integer> kth = new PriorityQueue<>((a,b)->a-b);
    int k ; 
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int n : nums) { 
           
            kth.add(n);
            if(kth.size()> k ) kth.poll();
           
           
        }
        
    }
    
    public int add(int val) {
        kth.add(val);
         if(kth.size()>k) kth.poll();
        return kth.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */