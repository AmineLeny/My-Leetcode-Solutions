/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        if( lists.length ==0  ) return res.next;
        PriorityQueue<ListNode> pq = new PriorityQueue<>( (a,b)-> a.val-b.val );
        for( ListNode l : lists ) { 
          if(l!= null)pq.add(l);
        }
        while( ! pq.isEmpty() ) { 
            ListNode polled = pq.poll();
            dummy.next = polled;
            if(polled.next!=null) pq.add(polled.next);
            dummy = dummy.next;
        }
        return res.next;
        
    }
}