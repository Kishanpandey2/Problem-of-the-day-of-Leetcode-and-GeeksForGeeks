class Solution
{
    int mod  = 1000000007 ;
    int []dp = new int[10001] ;
    public int CountWays(String str)
    {
        Arrays.fill(dp,-1) ;
        if(str.charAt(0)=='0')
        return 0 ;
        int len = str.length();
        return solve(str,len) ;
    }
    int solve(String str, int n)
    {
        if(n==0 || n == 1)
        return 1;
        int count = 0 ;
        if(dp[n]!= -1)
        return dp[n] ;
        if(str.charAt(n-1)>'0')
        count = solve(str,n-1) ;
        if(str.charAt(n-2)=='1' || str.charAt(n-2)=='2' && str.charAt(n-1)<'7')
        count = (count+solve(str,n-2)%mod)%mod;
        return dp[n]= count;
    }
}

