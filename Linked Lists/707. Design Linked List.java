class MyLinkedList {
    Node dummy ; 
    int i =0;

    class Node { 
        int val; 
        Node next;
        public Node( int val){
            this.val = val;
        }
        public Node(){}
    }



    public MyLinkedList() {
        dummy = new Node(0);
        
    }
    
    public int get(int index) {
        if( index <0 || index >=i ) { 
            return -1;
        }
        Node curr = dummy;
        for ( int j = 0 ; j <= index ; ++j){
            curr = curr.next;
        }
         return curr.val;

        

        
    }
    
    public void addAtHead(int val) {
        Node curr = new Node(val);
        curr.next = dummy.next;
        dummy.next = curr;
        i++;
        
    }
    
    public void addAtTail(int val) {
 
            Node curr = dummy;
            while ( curr.next != null ) { 
                curr= curr.next; 
            }
            curr.next = new Node(val);
            i++;
    }
    
    public void addAtIndex(int index, int val) {
        if( index<0 || index> i ) return; 
        Node addNode = new Node(val);
        Node curr = dummy;
        
        for( int j =0 ;j< index ; ++j) { 
            curr = curr.next;

        }
            addNode.next = curr.next;
            curr.next= addNode;
            i++;
    }
    
    public void deleteAtIndex(int index) {
        if( index<0 || index>=i) return;
        Node curr = dummy;
       
        for( int j =0 ; j< index ; ++j) {
            curr = curr.next;
        }
        if(curr.next!= null) {
            curr.next = curr.next.next;
        }
        i--;

        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */