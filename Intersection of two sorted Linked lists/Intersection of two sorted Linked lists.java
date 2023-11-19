

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
   Node dummy = new Node(-1);
    Node node = dummy;

   public  Node findIntersection(Node head1, Node head2)
    {
        if(head1== null || head2== null) return dummy.next;
        
        if(head1.data < head2.data ){
            head1 = head1.next; 
        }
        else if(head1.data > head2.data ){
            head2 = head2.next; 
        }
        else{
            node.next = new Node(head1.data);
            head1 = head1.next;
            head2 = head2.next;
            node = node.next;
        } 
        return findIntersection(head1 , head2);
    }
}
