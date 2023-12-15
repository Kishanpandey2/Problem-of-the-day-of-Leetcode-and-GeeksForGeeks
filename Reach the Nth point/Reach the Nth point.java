class Solution
{
    public int nthPoint(int n)
    { 
        if(n<=2)return n ;
        
        int mod = 1000000007 ;
        long a = 1, b = 2 ;
        long c = a+b ;
        
        for(int i = 3;i<n;i++){
            a = b % mod;
            b = c%mod ;
            c = (a+b)%mod ;
             
        }
        
        return (int)c ;
    }
}
