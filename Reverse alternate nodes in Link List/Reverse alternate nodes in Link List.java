class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        if(odd.next == null)return ;
       Node h1 = odd , h2 = odd.next ;
       Node temp1 = h1 , temp2 = h2 ;
       
       while(true){
           temp1.next = temp1.next.next ;
           temp1 = temp1.next ;
           
           if( temp2.next.next == null)
           {
               temp1.next = null  ;break ;
           }
           
           temp2.next= temp1.next ;
           temp2 = temp2.next ;
           
           if( temp1.next.next == null)
           {
               temp1.next = null  ;break ;
           }
           
       }
       temp2.next = null ;
       temp1.next = reverse(h2) ;
       
    }
    
    public static Node reverse(Node node){
        Node current = node ;
        Node prev = null ,next =null ;
        
        while(current!= null){
            next = current.next ;
            current.next = prev ;
            prev = current  ;
            current = next ;
        }
        
        return prev ;
    }
}
