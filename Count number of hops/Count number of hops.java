// Brute Force solution 
class Solution
{
    static long countWays(int n)
    {
        
     return help(n);    
    }
    private static long help(int n){
        if(n<0)return 0 ;
        if(n== 1 || n == 0)
        return 1 ;
        
        return help(n-1)+help(n-2)+help(n-3);
    }
    
}



// Efficient solution  Using DP

class Solution
{
    static  long mod = 1000000007 ;
    static long countWays(int n)
    {
        
        long []dp = new long[n+1] ;
        Arrays.fill(dp,-1);
        return help(n,dp);    
    }
    private static long help(int n,long []dp){
        if(n<0)return 0 ;
        if(n== 1 || n == 0)
        return 1 ;
        
        if(dp[n]!= -1)return dp[n] ;
        dp[n] = ( help(n-1,dp)%mod+help(n-2,dp)%mod+help(n-3,dp)%mod)%mod;
        
        return dp[n];
    }
    
}




// Efficient solution Method 2 

class Solution
{
    static long mod = 1000000007 ;
    static long countWays(int n)
    {
      long dp[] = new long[n+1]  ;
      if(n ==1 ||n ==2)return n;
      dp[1]=1 ;
      dp[2] = 2 ;
      dp[3] = 4 ;
      
      for(int i = 4;i<=n;i++){
          dp[i] = (dp[i-3]%mod+dp[i-2]%mod+dp[i-1]%mod)%mod ;
      }
      
      return dp[n];
    }
    
}

