class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int dp[]=new int[high+1];
        Arrays.fill(dp,-1);
        int ans=0;
        for(int i=low;i<=high;i++){
            ans=((ans%1000000007)+(f(i,dp,zero,one)%1000000007))%1000000007;
        }
        return ans;
    }
    public int f(int ind,int[] dp,int zero,int one){
        if(ind==0)
            return 1;
        if(ind<0)
            return 0;
        if(dp[ind]!=-1)
            return dp[ind];
        int forzero=f(ind-zero,dp,zero,one);
        int forone=f(ind-one,dp,zero,one);
        return dp[ind]=(forzero+forone)%1000000007;
    }
}
