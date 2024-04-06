// method - 1

class Solution {
    Long countWays(int n) {
        return (long)(n/2 +1) ;
    }
}




// Method - 2


class Solution {
    Long countWays(int n) {
        if(n == 1)return 1l ;
        long dp[] = new long[n] ;
        
        dp[0] = 1 ;
        dp[1] = 2;
        
        for(int i = 2;i<n;i++)
        dp[i] = dp[i-2]+1 ;
        
        return dp[n-1];
        
    }
}
