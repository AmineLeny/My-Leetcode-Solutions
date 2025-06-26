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
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)-> a-b );
        for( ListNode l : lists ) { 
            while (l!= null ) { 
                pq.add(l.val);
                l = l.next;
            }
        }
        while( ! pq.isEmpty() ) { 
            dummy.next = new ListNode(pq.poll());
            dummy = dummy.next;
        }
        return res.next;
        
    }
}