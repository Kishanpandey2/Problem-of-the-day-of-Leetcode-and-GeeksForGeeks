class Solution{
 static int mod = 1000000007;
	public static int countPaths(int n){
		//code here
	
		int dp[][] = new int[4][n+1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 3; j++) {
                dp[j][i] = (dp[j][i] + (dp[(j + 1) % 4][i - 1])) % mod;
                dp[j][i] = (dp[j][i] + (dp[(j + 2) % 4][i - 1])) % mod;
                dp[j][i] = (dp[j][i] + (dp[(j + 3) % 4][i - 1])) % mod;
            }
        }
        return dp[0][n];
	}
}
