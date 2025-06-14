/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = head;
        if( head == null) return null;
        Map<Node,Node> oldToNew = new HashMap<>();
        Node curr = head;
        while (curr != null) {
             Node tmp = new Node(curr.val);
            oldToNew.put(curr,tmp );
            curr = curr.next;
        }
        while(head != null){
            Node temp= oldToNew.get(head);
            temp.next = oldToNew.get(head.next);
            temp.random = oldToNew.get(head.random);
            head= head.next;
        }
        return oldToNew.get(dummy);

    }

   
}