class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum = 0 ;
        
        ListNode temp = head.next ;
        ListNode h1 = new ListNode(-1);
        ListNode t1  = h1 ; 
        while( temp != null){
            if(temp.val == 0 )
          {  t1.next = new ListNode(sum);
            t1 = t1.next ;
            sum = 0;
          }
            sum += temp.val;
            temp = temp.next ;
        }

        return h1.next ;
    }
}
