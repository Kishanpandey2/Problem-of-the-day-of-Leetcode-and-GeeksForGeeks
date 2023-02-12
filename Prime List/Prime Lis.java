class Solution
{
  
    Node primeList(Node head){
        Node cur = head ;
        int n = 100000 ;
        boolean isprime[] = new boolean[n+1] ;
        Arrays.fill(isprime,true);
        for(int i = 2;i*i<=n;i++)
        {
            if(isprime[i])
            {
                for(int j = i*i;j<=n;j=j+i)
                    isprime[j]=false ;
            }
        }
        while(cur!=null){
            if(cur.val==1){
                cur.val = 2  ; cur = cur.next ; 
                continue ;
            }
            int right = cur.val ;
            int left = cur.val ;
            while(!isprime[left])
            left-- ;
             while(!isprime[right])
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
