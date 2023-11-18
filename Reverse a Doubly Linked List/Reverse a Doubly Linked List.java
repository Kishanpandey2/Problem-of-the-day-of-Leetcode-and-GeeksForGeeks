
/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    if(head == null || head.next == null)return head;
    
    Node temp = null ;
    Node cur = head;
    while(cur != null)
    {
        temp = cur.prev ;
        cur.prev = cur.next ;
        cur.next = temp ;
        
        cur = cur.prev ;
    }
    if(temp != null)
    head = temp.prev ;
    
    return head;
}
