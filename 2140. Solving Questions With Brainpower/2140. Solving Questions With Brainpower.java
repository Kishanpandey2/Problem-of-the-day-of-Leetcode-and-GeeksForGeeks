class Solution {
    public long mostPoints(int[][] questions) {
        int n=questions.length;
        long dp[]=new long[n];
        Arrays.fill(dp,-1l);
        return f(0,dp,questions);
    }
    public long f(int ind,long[] dp,int[][] questions){
        if(ind>=questions.length)
            return 0;
        if(dp[ind]!=-1l)
            return dp[ind];
        long take=questions[ind][0]+f(ind+questions[ind][1]+1,dp,questions);
        long nottake=f(ind+1,dp,questions);
        dp[ind]=Math.max(take,nottake);
        return dp[ind];
    }
}
