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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);

        ListNode smallHead = small, longHead = big ;

        while(head!=null)
        {
            if(head.val<x)
            {
                smallHead.next = head ;
                smallHead = smallHead.next ;
            }
            else
            {
                longHead.next = head ;
                longHead = longHead.next ;
            }

            head = head.next;
        }

        longHead.next = null ;

        smallHead.next = big.next ;

        return small.next;
    }

}
