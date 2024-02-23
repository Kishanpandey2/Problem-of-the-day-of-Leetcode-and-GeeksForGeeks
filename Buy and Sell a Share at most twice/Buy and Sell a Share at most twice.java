
class Solution {
    public static int maxProfit(int n, int[] arr) {
        int dp[][][]=new int[n+1][3][2];
        
        for(int i=n-1;i>=0;i--){
            for(int isbuy=0;isbuy<=1;isbuy++){
                for(int tran=1;tran<=2;tran++){
                    int ans=0;
                    if(isbuy==1){
                        int buy=dp[i+1][tran][0]-arr[i];
                        int notBuy=dp[i+1][tran][1];
                        ans+=Math.max(buy,notBuy);
                        dp[i][tran][isbuy]=ans;
                    }
                    else{
                        int sell=arr[i]+dp[i+1][tran-1][1];
                        int notSell=dp[i+1][tran][0];
                        dp[i][tran][isbuy]=Math.max(sell,notSell);
                    }
                }
            }
        }
        return dp[0][2][1];
    
    }
}
        
