// method 1 


class Solution
{
    public static Node reverse(Node head, int k)
    {
        Node cur  = head , prev = null , next = null ;
        int cnt  = 0 ;
    while(cur!= null && cnt < k)
    {
     next  = cur.next ;
     cur.next = prev ;
     prev = cur ;
     cur = next ;
     
     cnt++;
    }
    
    if(next != null)
    {
        Node newHead = reverse(next,k) ;
        head.next = newHead;
    }
    
    return prev;
    }
}

// Method  2

class Solution
{
    public static Node reverse(Node head, int k)
    {
         Node curr=head, prevFirst=null; 
        //strore last node of reversed grp
        boolean isFirst=true;
         
        while(curr!=null)
        {
            Node first=curr;// to store the starting node of each group, 
            //which will also be the last node after getting reversed.
        //reversal
            Node prev=null; int count=0;
             while(curr!=null && count<k){
        
                Node next=curr.next; 
                curr.next=prev; prev=curr; curr = next; 
                
                count++;
            } 
            
            if(isFirst ){
                head = prev; isFirst=false;
            }
            else
            prevFirst.next=prev; // pointing to new head of current reversed grp
            
            prevFirst=first; 
        }
         return head;
    }

}
