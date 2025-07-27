class LRUCache {

   ; class Node {
        Node next;
        Node prev; 
        int key;
        int val;
        public Node ( int key, int value ) {
            this.key=  key;
            this.val = value;
        }

        
        
    }

    Map<Integer , Node> cache;
    Node lru;
    Node mru;
    int size;
    int capacity;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.size = 0;
        this.capacity = capacity;
        this.lru = new Node(-1,-1);
        this.mru = new Node(-1,-1);
        lru.next = mru;
        mru.prev = lru;
        
    }
    public void  remove( Node node) { 
            if( node.next != null)
            node.next.prev= node.prev;
            if(node.prev != null)
            node.prev.next = node.next;
            
        }
    
    public int get(int key) {
        if( cache.containsKey(key)){
            Node tmp = cache.get(key);
            remove(tmp);
            mru.prev.next = tmp;
            tmp.prev = mru.prev;
            mru.prev = tmp;
            tmp.next = mru;
            return tmp.val;

        }
        else return -1;
        
    }
    
    public void put(int key, int value) {
        if ( cache.containsKey(key) ) {
            Node tmp = cache.get(key);
            remove(tmp);
            tmp.val= value;
            mru.prev.next = tmp;
            tmp.prev = mru.prev;
            mru.prev = tmp;
            tmp.next = mru;
            
        }
        else if ( size < capacity ) {
            Node tmp = new Node(key,value);
            cache.put(key,tmp);
            mru.prev.next = tmp;
            tmp.prev = mru.prev;
            mru.prev = tmp;
            tmp.next = mru;
            size++;
        }
        else { 
            Node tmp = lru.next;
            cache.remove(tmp.key);
            remove(tmp);
            size--;
            put(key,value);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */