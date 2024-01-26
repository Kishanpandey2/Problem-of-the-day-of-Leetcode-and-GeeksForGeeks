class Solution {
    long mod = 1000000007 ;
    int dp[][][];
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove+1] ;

        for(int i= 0 ;i<m;i++)
        for(int j = 0;j<n;j++)
       { Arrays.fill(dp[i][j],-1) ;
       dp[i][j][0] = 0 ;
       }


        return (int)help(m,n,maxMove , startRow, startColumn) ;
    }

     long help(int m , int n, int maxMove ,int r,int c){
        if(r<0 || r>m-1 || c<0 || c>n-1)return 1 ;

        long res = 0;

         if(dp[r][c][maxMove]!=-1)return dp[r][c][maxMove] ;
        res += help(m,n,maxMove-1 , r +1 , c)%mod ;
         res += help(m,n,maxMove-1 , r - 1 , c)%mod ;
          res += help(m,n,maxMove-1 ,  r , c+1)%mod ;
           res += help(m,n,maxMove-1 , r , c-1)%mod ;

           return dp[r][c][maxMove] = (int)(res % mod) ;
     
    }
}
