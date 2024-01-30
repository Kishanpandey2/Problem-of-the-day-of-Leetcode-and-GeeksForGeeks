
/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
       Node slow = head , fast = head ;
        Node temp = new Node(data) ;
        
        if(head.next == null ){
            head.next = temp ;
            return head ;
        }
       
       while(fast != null && fast.next != null&& fast.next.next != null)
       {
           slow = slow.next ;
           fast = fast.next.next;
       }
       
      
       temp.next = slow.next ;
       slow.next = temp ;
       
       return head;
    }
}
