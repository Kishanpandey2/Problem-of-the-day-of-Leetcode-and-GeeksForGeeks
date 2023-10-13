class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp = new int[1001]  ;
        dp[0] = cost[0] ;
        dp[1] = cost[1] ;

        int n = cost.length ;


        for(int i = 2;i<n ;i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }

        return Math.min(dp[n-1],dp[n-2]);
    }
}
