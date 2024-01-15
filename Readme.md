
class Solution {
    public int max_courses(int n, int total, int[] cost) {
        int dp[][] = new int[n][total+1];
        for(int i =0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        return helper(0,n,total, cost,dp);
    }
    public int helper(int i, int n, int total, int cost[], int dp[][]){
        if(i>=n){
            return 0;
        }
        if(dp[i][total] != -1){
            return dp[i][total];
        }
        int take = 0;
        int not = helper(i+1, n, total, cost, dp);
        if(total >= cost[i]){
            take = 1+helper(i+1, n, total-cost[i]+(int)(Math.floor(((double)cost[i]*0.9))), cost, dp);
        }
        return dp[i][total] = Math.max(take, not);
    }
}

