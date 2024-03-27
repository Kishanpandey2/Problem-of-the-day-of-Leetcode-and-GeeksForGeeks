class Solution {
    public static int findShortestPath(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        
        int dp[][] = new int[r][c];
        
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        
        // marking all the cell adjacent to landmines as 2
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                
                if(mat[i][j] == 0){
                    for(int x = 0; x < 4; x++){
                        int ni = dx[x] + i;
                        int nj = dy[x] + j;
                        
                        if(ni >= 0 && ni < r && nj >= 0 && nj < c && mat[ni][nj] != 0){
                            mat[ni][nj] = 2;
                        }
                    }
                }
                
            }

        }
        
        for(int i = 0; i < r; i++){
            Arrays.fill(dp[i], (int)10e9);
        }
        
        for(int i = 0; i < r; i++){
            if(mat[i][0] == 1){
                dfs(mat, dp, i, 0, r, c, 1);
            }
        }
        
        int ans = (int)10e9;
        for(int i = 0; i < r; i++){
            ans = Math.min(ans, dp[i][c - 1]);
        }

        return ans == (int)10e9 ? -1 : ans;
    }
    
    public static void dfs(int mat[][], int dp[][], int i, int j, int r, int c, int path){

        if(i < 0 || i >= r || j < 0 || j >= c){
            return;
        }
        
        if(j == c - 1){
            dp[i][j] = Math.min(path, dp[i][j]);
            return;
        }
        
        
        if(mat[i][j] == 0 || mat[i][j] == 2){
            return;
        }
        
        if(dp[i][j] != Integer.MAX_VALUE && dp[i][j] <= path){
            return ;
        }
        
        dp[i][j] = path;
        
        dfs(mat, dp, i - 1, j, r, c, path + 1);
        dfs(mat, dp, i + 1, j, r, c, path + 1);
        dfs(mat, dp, i, j - 1, r, c, path + 1);
        dfs(mat, dp, i, j + 1, r, c, path + 1);
    }
}
