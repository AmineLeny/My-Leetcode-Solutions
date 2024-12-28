/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> check = new HashSet<>();
        ListNode curr = head;
        while (curr!= null) { 
            if(check.contains(curr)) return true;
            else check.add(curr);
            curr = curr.next;
        }
        return false;
        
    }
}