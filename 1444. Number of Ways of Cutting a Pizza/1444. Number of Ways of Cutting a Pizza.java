class Solution {
    public int ways(String[] pizza, int k) {
        int m = pizza.length, n = pizza[0].length();
        Integer[][][] dp = new Integer[k][m][n];
        int[][] preSum = new int[m+1][n+1];

        for (int r = m - 1; r >= 0; r--)
            for (int c = n - 1; c >= 0; c--)
                preSum[r][c] = preSum[r][c+1] + preSum[r+1][c] - preSum[r+1][c+1] + (pizza[r].charAt(c) == 'A' ? 1 : 0);

        return dfs(m, n, k-1, 0, 0, dp, preSum);
    }

    int dfs(int m, int n, int k, int r, int c, Integer[][][] dp, int[][] preSum) {
        if (preSum[r][c] == 0) return 0; 
        if (k == 0) return 1;
        if (dp[k][r][c] != null) return dp[k][r][c];
        int res = 0;
        
        for (int no = r + 1; no < m; no++) 
            if (preSum[r][c] - preSum[no][c] > 0)
                res = (res + dfs(m, n, k - 1, no, c, dp, preSum)) % 1_000_000_007;
        for (int nc = c + 1; nc < n; nc++) 
            if (preSum[r][c] - preSum[r][nc] > 0)
                res = (res + dfs(m, n, k - 1, r, nc, dp, preSum)) % 1_000_000_007;
                
        return dp[k][r][c] = res;
    }
}
