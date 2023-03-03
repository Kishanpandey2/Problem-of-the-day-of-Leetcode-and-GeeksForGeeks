class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        List<Long> ans  =  new ArrayList<>() ;
        long k = gcd(L,B) ;
        long no_of_sq = (L*B)/ (k*k) ;
        
        ans.add(no_of_sq ) ;
        ans.add(k) ;
        
        return ans ;
    }
    static long gcd(long a, long b)
    {
        if(b==0)
        return a ;
        
        return gcd(b,a%b) ;
    }
}
