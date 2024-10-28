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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode temp = head;
        ListNode temp2 = temp.next;
        while(temp2 != null) {
            if(temp.val == temp2.val) { 
                temp.next = temp2.next;
                temp2 = temp.next;
            }
            else {
                temp = temp.next;
                temp2 = temp2.next;
                }
        }
        return head;
    }
}