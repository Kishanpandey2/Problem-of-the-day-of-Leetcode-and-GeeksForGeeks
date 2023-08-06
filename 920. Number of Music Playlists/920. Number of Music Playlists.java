class Solution {
    int mod = 1000000000 + 7;
    public int numMusicPlaylists(int n, int goal, int k) {
        int[][] dp = new int[n+1][goal+1];
        for(int[] d : dp)
            Arrays.fill(d, -1);
        return (int)solve(n, goal, k, dp);
    }

    long solve(int n, int g, int k, int[][] dp){
        if(n == 0 && g == 0)
            return 1;
        if(n == 0 || g == 0)
            return 0;
        if(dp[n][g] != -1)
            return dp[n][g];
        long inc = solve(n-1, g-1, k, dp) * n;
        long exc = solve(n, g-1, k, dp) * Math.max(n-k, 0);
        return dp[n][g] = (int)(inc%mod + exc%mod)%mod;
    }
}
