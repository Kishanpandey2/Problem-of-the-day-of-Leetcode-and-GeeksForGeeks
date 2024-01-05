class Solution
{
    public int TotalWays(int N)
    {
        long mod = 1000000007 ;
        
        long a = 1, b = 1 , c = 0 ;
        
        for(int i = 1;i<=N;i++)
        {
            c = (a%mod+b%mod)%mod ;
            a = b%mod ;
            b = c %mod ;
            
        }
        
        return (int) ((c*c)%mod) ;
         
    }
}
