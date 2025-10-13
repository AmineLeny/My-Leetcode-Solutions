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
        
        PriorityQueue<ListNode> l = new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode result = new ListNode();

        for (ListNode n : lists ){
            if(n != null )l.add(n);
            }
        ListNode curr = result;
        while (!l.isEmpty()){
            curr.next = l.poll();
            if(curr.next.next != null )l.add(curr.next.next);
            curr = curr.next;
        }

        return result.next;




    }
}