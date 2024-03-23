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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head ;

        while(fast!= null && fast.next!=null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }

            ListNode rev = slow.next ;
            slow.next = null;
        rev = reverse(rev ) ;
      
      ListNode cur = head ; 
      ListNode temp= null;
      while(rev!=null){
        temp = cur.next ;

        cur.next = rev ;
        cur = temp ;
        temp = rev.next ;
        rev.next  = cur ;
        rev= temp ;
      }
        
    }
    ListNode reverse(ListNode root){
        ListNode prev = null  , cur = root ;

        while(cur!= null){
            ListNode next = cur.next ;
            cur.next = prev ;
            prev = cur;
            cur = next ;
        }

        return prev ;
     }
     
}
