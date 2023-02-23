class Solution {
    static int uniquePaths(int n, int m, int[][] grid) {
        int mod=1000000007;
        //check if destination can be reached
        if(grid[0][0]==0 || grid[n-1][m-1]==0){
            return 0;
        }
        
        int[][] dp=new int[n][m];
        dp[0][0]=grid[0][0] % mod;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==0){
                    if(j!=0 && grid[i][j]!=0){
                       dp[i][j]=(dp[i][j]+dp[i][j-1]) % mod; 
                    }
                }
                else if(j==0 && grid[i][j]!=0){
                    if(i!=0){
                        dp[i][j]=(dp[i][j]+dp[i-1][j]) % mod;
                    }
                }
                else{
                    //logic
                    if(grid[i][j]!=0){
                        dp[i][j]=(dp[i][j]+dp[i-1][j]+dp[i][j-1]) % mod;
                    }
                }
            }
        }
        
        int res=(dp[n-1][m-1]) % mod;
        return res;

    }
};
