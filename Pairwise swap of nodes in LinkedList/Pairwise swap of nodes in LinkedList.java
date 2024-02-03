// Method - 1
/*class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } */
class Swap
{
   
    public static Node pairwise_swap(Node node)
    {
        Node cur = node ;
        
        while(cur!= null && cur.next != null)
        {
            int temp = cur.data ;
             cur.data  = cur.next.data ;
             cur.next.data= temp ;
             
             cur = cur.next.next ;
        }
        
        return node ;
        
    }
       
}




// Method - 2 
/*class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } */
class Swap
{
   
    public static Node pairwise_swap(Node node)
    {
        if( node == null || node.next == null) return node ;
        
        Node cur = node.next.next ;
        Node prev = node; 
        
        node = node.next;
        node.next = prev ;
        
        while(cur != null && cur.next != null){
            prev.next = cur.next;
            Node next = cur.next.next ;
            
            prev = cur ;
            cur.next.next = cur ;
            cur =next ;
        }
        
        prev.next = cur ;
        
        return node;
    }
       
}
