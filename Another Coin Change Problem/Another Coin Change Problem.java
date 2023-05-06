class Solution {
    public static boolean makeChanges(int N, int K, int target, int[] coins) {
       
        boolean[][] dp=new boolean[K+1][target+1];
        for(int j = 0; j <= K; j++) {
            for(int k = 0; k <= target; k++) {
                dp[j][k] = false;
            }
        }
        dp[0][0] = true;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= K; j++) {
                for(int k = coins[i-1]; k <= target; k++) {
                    dp[j][k] |= dp[j-1][k-coins[i-1]];
                }
            }
        }
        return dp[K][target];
    }
}


