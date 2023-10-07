class Solution {
    int mod = 1000000007 ;
    public int numOfArrays(int n, int m, int k) {
        int [][][]memo ;
         memo = new int[n+1][m + 1][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return help(0,0,0,n,m,k,memo) ;
    }

    public int help(int ind ,int curMax , int curCost ,int n,int m,int k ,int [][][]memo){
        if(curCost>k)return 0 ;

        if(ind == n){
            if(curCost == k)return 1 ;
            return 0 ;
        }

        if(memo[ind][curMax][curCost]!=-1)
        return  memo[ind][curMax][curCost];
            int ans = 0 ;
        for(int num = 1;num<=m ;num++){
            if(num>curMax){
                ans += help(ind+1,num,curCost+1,n,m,k,memo) ;
            }
            else
            ans += help(ind+1,curMax,curCost,n,m,k,memo) ;

            ans%=mod ;
        }

        return memo[ind][curMax][curCost] = ans ;
    }
}
