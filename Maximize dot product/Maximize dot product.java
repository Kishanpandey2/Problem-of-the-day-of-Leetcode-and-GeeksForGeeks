
class Solution
{
	public int maxDotProduct(int n, int m, int A[], int B[]) 
	{ 
  int[][] dp = new int[m + 1][n + 1];
     //B
        for (int i = 1; i <= m; i++) {
            //A 
            for (int j = i; j <= n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + (A[j - 1] * B[i - 1]), dp[i][j-1]);
            }
        }
       
        return dp[m][n];
	} 
}
