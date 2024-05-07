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
    public ListNode doubleIt(ListNode head) {
        int carry = 0 ;
        ListNode rv = rev(head );

        ListNode dummy =null;
        ListNode tempHead = dummy ;
        while(rv != null){
            int mul = rv.val * 2 + carry ;

            int rem = mul % 10 ;
            carry = mul / 10 ;
            ListNode temp = new ListNode(rem);
            temp.next = dummy ;
            dummy = temp ;

            rv = rv.next;

        }
        if(carry>0)
        {
            ListNode temp = new ListNode(carry);
            temp.next = dummy ;
            dummy = temp ;
        }
return dummy;
    }
    public ListNode rev(ListNode head){
        ListNode prev =null ;

        ListNode cur = head ;

        while(cur != null){
            ListNode next = cur.next ;
            cur.next = prev ;
            prev =cur ;
            cur = next ;
        }

        return prev ;
    }
}
