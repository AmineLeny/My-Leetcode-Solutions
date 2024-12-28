class MinStack {
    Node dummy;
    class Node { 
        int val; 
        Node next; 
        int min;
        public Node () { 

        }
        public Node(int val ) { 
            this.val = val;
        }

    }

    public MinStack() {
        dummy = new Node(0);
        p = -1;
    }
    
    public void push(int val) {
        if( dummy.next == null) {
            dummy.next = new Node(val);
            dummy.next.min = val;
            return;
        }
       
        Node curr = new Node(val);
        curr.min = Math.min(val,dummy.next.min);
        curr.next = dummy.next;
        dummy.next= curr;

        
    }
    
    public void pop() {
        Node curr = dummy.next;
        dummy.next = curr.next;
        curr  = null;
        
    }
    
    public int top() {
        return dummy.next.val;

        
    }
    
    public int getMin() {
        return dummy.next.min;

        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */