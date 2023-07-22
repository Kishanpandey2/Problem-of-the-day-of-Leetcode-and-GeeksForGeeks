class Solution
{
   
    public Node removeDuplicates(Node head) 
    {
     Set<Integer>st = new HashSet<>() ;
     Node cur = head , prev = null ;
     while(cur!=null) {
         if(st.contains(cur.data))
         {
             prev.next = cur.next ;
         }
         else
        {
            st.add(cur.data) ;
            prev = cur ;
        }
        cur = cur.next ;
     }
     return head;
    }
}
