public class Solution {
    
    public ListNode detectfirstNode(ListNode head)
    {
ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next!=null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast )
                return slow ;
        }
        return  null;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode meet = detectfirstNode(head) ;
        if(meet == null)
            return null;
        ListNode start = head ;
        while(start!=meet)
        {
start = start.next ;
            meet= meet.next ;
           
            }
        return start ;
    }
}
