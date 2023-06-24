class Solution {
    public int tallestBillboard(int[] rods) {
        int sum = 0;
        for (int rod : rods) {
            sum += rod;
        }

        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int rod : rods) {
            int[] dpCopy = dp.clone();

            for (int i = 0; i <= sum - rod; i++) {
                if (dpCopy[i] < 0) continue;

                dp[i + rod] = Math.max(dp[i + rod], dpCopy[i]);
                dp[Math.abs(i - rod)] = Math.max(dp[Math.abs(i - rod)], dpCopy[i] + Math.min(i, rod));
            }
        }

        return dp[0];
    }
}
