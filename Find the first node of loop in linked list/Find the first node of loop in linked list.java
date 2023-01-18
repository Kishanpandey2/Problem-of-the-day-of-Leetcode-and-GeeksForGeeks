class Solution {
    public static int findFirstNode(Node head){
       
        Node slow = head ;
        Node fast = head ;
        while(slow.next!=null && fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow==fast)
            {
                slow = head ;
                while(slow!=fast)
                {
                    slow = slow.next ;
                    fast = fast.next;
                    
                }
                return slow.data;
            }
        }
      
        return -1;
    }
}
