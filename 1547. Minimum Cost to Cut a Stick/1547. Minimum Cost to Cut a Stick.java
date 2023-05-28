class Solution {
    int[][] dp;
    
    int solve(int start_stick, int end_stick, int[] cuts, int left, int right) {
        if (left > right) return 0;

        if (dp[left][right] != -1) return dp[left][right];

        int cost = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            int left_cost = solve(start_stick, cuts[i], cuts, left, i - 1);
            int right_cost = solve(cuts[i], end_stick, cuts, i + 1, right);
            int curr_cost = (end_stick - start_stick) + left_cost + right_cost;
            cost = Math.min(cost, curr_cost);
        }

        return dp[left][right] = cost;
    }
    
    int minCost(int n, int[] cuts) {
        dp = new int[cuts.length][cuts.length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        Arrays.sort(cuts);
        return solve(0, n, cuts, 0, cuts.length - 1);
    }
}
