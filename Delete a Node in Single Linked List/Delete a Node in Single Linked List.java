
class GfG
{
    Node deleteNode(Node head, int x)
    {
        if(head == null || x==0)return null;
        Node temp ;
       int i = 0 ;
        for(temp = head ;temp!= null ;temp = temp.next )
        i++ ;
        
        
        if(x>i)return null ;
        else if(x==1)
        {
            head = head.next  ;
            return head ;
        }
        else
        {
            Node t = head ;
            for(i = 0 ;i<x-2;i++)
            t = t.next ;
            
            if(t.next.next == null)
            t.next = null ;
            else
            t.next = t.next.next ;
            
            return head;
        }
    }
}
