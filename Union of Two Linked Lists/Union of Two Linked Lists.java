
class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    Set<Integer>st = new TreeSet<>();
	     
	    Node cur = null ;
	    Node start =null;
	    while(head1!= null)
	    {
	        st.add(head1.data);
	        head1 = head1.next ;
	    }
	    while(head2!= null)
	    {
	        st.add(head2.data);
	        head2 = head2.next ;
	    }
	     
	    
	    for(int n:st)
	    {
	        if(start == null )
	        {
	            start = new Node(n) ;
	            cur = start ;
	        }
	       else
	       {
	           cur.next = new Node(n);
	           cur = cur.next ;
	       }
	    }
	    
	    return start;
	}
}
