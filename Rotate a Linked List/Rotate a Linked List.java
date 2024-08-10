
class Solution {
    
    public Node rotate(Node head, int k) {
       Node tail = head;
       while(tail.next!= null)
       {
           tail = tail.next ;
       }
       
      
       
       while(k>0)
       {
           tail.next = new Node(head.data) ;
           head = head.next ;
           tail= tail.next ;
           k--;
       }
       
       return head ;
       
       
    }
}
