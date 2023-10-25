
class Solution{
    static int [][]dp ;
    static int helper(int N, int i, int W, int []val,int []wt){
        if(i == N)return 0 ;
        if(dp[i][W]!= -1)return dp[i][W] ;
        if(wt[i]>W)return dp[i][W]= helper(N,i+1,W,val,wt) ;
        else{
            int ans1 = val[i]+helper(N,i+1,W-wt[i],val,wt) ;
            int ans2 = val[i] + helper(N,i,W-wt[i],val,wt) ;
            int ans3= helper(N,i+1,W,val,wt) ;
            
            return dp[i][W]=Math.max(ans1, Math.max(ans2,ans3) ) ;
        }
    }
    static int knapSack(int N, int W, int val[], int wt[])
    {
        dp = new int[1001][1001] ;
        
        for(int i[] : dp)Arrays.fill(i,-1) ;
        
        return helper(N,0,W,val,wt) ;
    }
}
