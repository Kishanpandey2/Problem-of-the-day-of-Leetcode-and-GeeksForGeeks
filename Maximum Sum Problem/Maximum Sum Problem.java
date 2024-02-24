
class Solution
{
    public int maxSum(int n) 
    { 
        if(n<=2)return n;
         int []dp = new int[n+1] ;
         
         dp[0] = 0 ;
         dp[1] = 1 ;
  
         for(int i = 2;i<=n;i++)
         dp[i] = Math.max(i,dp[i/2]+dp[i/3]+dp[i/4]);
         
         return dp[n];
    } 
}
