
// method - 1
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0  ;

      
        for(ListNode temp = head ;temp != null; temp = temp.next) size++ ;

        int len = size - n -1 ;
        if(len < 0) return head.next ;
        ListNode temp = head ;

        for(int i = 0  ;i<len;i++)
        temp = temp.next ;

       

        temp.next = temp.next.next ;
        return head ;
    }
}






// Method - 2

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
       ListNode first = head ;

       for(int i = 0 ;i<n;i++)
       first  = first.next ;

       ListNode second = head ;

        if(first == null)return second.next ;
        
       while(first.next != null)
        {
            second  = second.next ;
            first = first.next ;
        }

        second.next = second.next.next ;

        return head;

    }
}
