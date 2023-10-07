
class Solution {
    public Node pairwiseSwap(Node head)
    {
       if(head == null || head.next == null)return head ;
       
       Node prev = head , cur = prev.next ;
       head = cur ;
       
       while(true){
           Node next = cur.next ;
           cur.next = prev ;
           
           if(next == null || next.next == null)
           {
               prev.next = next ;  break ;
           }
           else
           prev.next = next.next ;
           
           
           prev = next ;
           cur= next.next ;
       }
       
       return head;
    }
}
