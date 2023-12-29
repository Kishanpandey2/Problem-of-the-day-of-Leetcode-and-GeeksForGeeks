public class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int jobs = jobDifficulty.length;

        // Check if it's impossible to do at least 1 job every day
        if (jobs < d)
            return -1;

        // Initialize a 2D array to store difficulty for each day and job
        int[][] dp = new int[d][jobs];

        // Fill the first day's difficulties
        dp[0][0] = jobDifficulty[0];
        for (int i = 1; i < jobs; i++)
            dp[0][i] = Math.max(dp[0][i - 1], jobDifficulty[i]);

        // Iterate over each day
        for (int days = 1; days < d; days++) {
            // Iterate over each job
            for (int i = days; i < jobs; i++) {
                int localMax = jobDifficulty[i];
                dp[days][i] = Integer.MAX_VALUE; // Set an initial high value

                // Iterate over previous jobs to find optimal difficulty
                for (int j = i; j >= days; j--) {
                    localMax = Math.max(localMax, jobDifficulty[j]);
                    dp[days][i] = Math.min(dp[days][i], dp[days - 1][j - 1] + localMax);
                }
            }
        }

        // Return the minimum difficulty for the last day
        return dp[d - 1][jobs - 1];
    }
}
