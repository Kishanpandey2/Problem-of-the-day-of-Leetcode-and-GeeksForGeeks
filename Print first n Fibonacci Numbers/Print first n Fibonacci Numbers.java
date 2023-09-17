
class Solution
{
    
    public static long[] printFibb(int n) 
    {
        long [] ans = new long[n] ;
        if(n ==1)
        {
            ans[0] = 1 ; return ans ;
        }
        
        ans[0] = 1 ;
        ans[1] = 1 ;
        
        for(int i = 2;i<n;i++){
            ans[i] = ans[i-2]+ans[i-1]  ;
        }
        
        return ans ;
        
    }
}
