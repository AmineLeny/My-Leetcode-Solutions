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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = head ;
        int c = 0;
        while (d != null ) { 
            c++;
            d =d.next;
        }
        int index = c-n;
        if( index == 0 ) return head.next;
        int k = 0 ; 
        d= head;
        while ( d!= null ) { 
            
            if(++k == index ){
                ListNode next = d.next;
                d.next = next.next;
                break;
            }
            d = d.next;
        }
        return head;  
    }
}