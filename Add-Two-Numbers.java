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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int sum = 0 ; 
        int q = 0;
        ListNode result = new ListNode();
        ListNode res = result;
        while(l1!=null && l2!=null) {
            int tmp =  (q+l1.val + l2.val);
            sum=(tmp)%10;
            result.next =new ListNode(sum); 
            result= result.next;
            q = tmp/10;
            l1=l1.next;
            l2=l2.next;
        }
         while( l1!=null) {
            sum = l1.val +q  ;
            result.next =new ListNode(sum%10);
            result= result.next;
            q=  sum/10; 
            l1= l1.next;
        }
        while( l2!=null) {
           sum = l2.val +q  ;
            result.next =new ListNode(sum%10);
            result = result.next;
            q=  sum/10;
            l2= l2.next;
        }

        if(q!=0) result.next = new ListNode(q);
       
       return res.next;

        
    }
}