class Intersect
{
    
	int intersectPoint(Node head1, Node head2)
	{
         int len1 = 0 , len2 = 0 ;
         for(Node cur  = head1 ;cur.next!=null ;cur = cur.next){
             len1++ ;
         }
         for(Node cur  = head2 ;cur.next!=null ;cur = cur.next){
             len2++ ;
         }
         int dif = (len1>len2) ? len1-len2 : len2-len1 ;
        Node temp = (len1>len2) ? head1 : head2 ;
        while(dif>0 && temp.next!=null){
            dif--;
            temp = temp.next ;
            
        }
        Node y = (len1>len2) ? head2 : head1 ;
        while(temp!=null && y!=null){
            if(temp==y) return temp.data ;
            temp = temp.next ;
            y = y.next ;
        }
        return -1 ;
	}
}

