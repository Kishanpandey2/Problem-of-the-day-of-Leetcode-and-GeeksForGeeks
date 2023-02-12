class Solution
{
    boolean prime(int n){
        if(n==1)return false ;
        if(n==2 || n==3)return true ;
        if(n%2==0 || n%3==0)
        return false ;
       for(int i = 5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
                return false;
           
        }
        return true ;
    }
    Node primeList(Node head){
        Node cur = head ;
      
        while(cur!=null){
            if(cur.val==1){
                cur.val = 2  ; cur = cur.next ; 
                continue ;
            }
            int right = cur.val ;
            int left = cur.val ;
            while(!prime(left))
            left-- ;
             while(!prime(right))
            right++ ;
            
            if((cur.val-left)>(right-cur.val))
            cur.val = right ;
            else
            cur.val = left ;
            cur = cur.next ;
        }
        return head ;
    }
}
