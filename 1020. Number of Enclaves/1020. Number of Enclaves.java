class Solution {
    public int numEnclaves(int[][] grid) {
        int cnt = 0  ;
        for(int i = 0 ;i<grid.length ;i++){
            for(int j = 0 ;j<grid[0].length ;j++){
                if(i ==0  || j == 0 || i == grid.length - 1 || j == grid[0].length-1){
                    dfs(grid,i,j) ;
                }
            }
        }

         for(int i = 0 ;i<grid.length ;i++){
            for(int j = 0 ;j<grid[0].length ;j++){
                if(grid[i][j] == 1)
                cnt++;
            }
        }
        return cnt ;

    }
    public void dfs(int [][]ar,int i, int j){
        if(i<0 || j<0 || i>=ar.length || j>=ar[0].length || ar[i][j]==0)
        return  ;

        ar[i][j] = 0 ;

        dfs(ar,i+1,j) ;
        dfs(ar,i-1,j) ;
        dfs(ar,i,j+1) ;
        dfs(ar,i,j-1) ;
    }
}
