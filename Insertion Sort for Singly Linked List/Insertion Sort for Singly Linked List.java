
/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node insertionSort(Node head_ref)
    {
        Node dummy = new Node(-1) ;
        
        Node cur = head_ref ;
        
        while(cur!= null){
            Node temp = cur.next ;
            Node prev = dummy ;
            Node nxt = dummy.next ;
            
            while(nxt!= null){
                if(nxt.data>cur.data)
                break;
                
                prev = nxt;
                nxt = nxt.next ;
            }
            cur.next = nxt ;
            prev.next = cur ;
            cur = temp;
        }
        
        return dummy.next ;
    }
}
