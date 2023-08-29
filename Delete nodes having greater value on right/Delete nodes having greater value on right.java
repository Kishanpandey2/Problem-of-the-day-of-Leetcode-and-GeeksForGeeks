
class Solution
{
    Node compute(Node head)
    {
       Node new_head = rev(head);
       Node cur = new_head;
       Node temp = null ;
       Node max = cur;
       
       while(cur.next!= null){
           if(cur.next.data < max.data){
               temp = cur.next;
               cur.next= temp.next;
               
           }
           else{
               cur = cur.next ;
               max = cur;
           }
           
       }
       return rev(new_head);
    }
    
    Node rev(Node head){
        Node prev = null,next =  null ;
        Node cur = head;
        
        while(cur!= null){
            next= cur.next;
            cur.next = prev;
            prev= cur ;
            cur = next;
        }
        return prev;
    }
}
  
