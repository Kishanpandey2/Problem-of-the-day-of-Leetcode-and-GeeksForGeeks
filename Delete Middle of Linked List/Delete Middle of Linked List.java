
/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        if(head.next ==null)return null ;
        
        
        int len = 0 ;
        for(Node cur = head ;cur != null ;cur = cur.next)
        len++ ;
        
        Node slow = head ;
        Node prev = head ;
        
        for(int i = 0 ;i<len/2;i++)
        {
            prev =slow ;
            slow = slow.next ;
        }
        
        prev.next = slow.next ;
        return head ;
    }
}
