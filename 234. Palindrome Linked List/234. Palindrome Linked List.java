// Method - 1   using space
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
    public boolean isPalindrome(ListNode head) {
        Deque<Integer>st = new ArrayDeque<>() ;

        ListNode cur = head ;

        while(cur != null){
            st.push(cur.val) ;
            cur = cur.next ;
        }

        cur =head ;
        while(!st.isEmpty())
        {
            if(cur.val != st.pop() )return false;
            cur = cur.next;
        }

        return true;
    }
}








// method - 2  using without space 

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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head ;
         ListNode fast = head ;

        while(fast!= null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        ListNode rev = reverse(slow) ;
        ListNode cur = head ;

        while(rev != null && cur != null )
        {
            if(rev.val != cur.val)return false;
            rev = rev.next ;
            cur = cur.next;
        }
        
                return true;
    }

    ListNode reverse(ListNode head){
        ListNode cur = head , prev = null ;

        while(cur != null){
            ListNode next = cur.next ;
            cur.next = prev ;
            prev = cur  ;
            cur = next;
        }

        return prev;
    }
}
