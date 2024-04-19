class Solution {
    public int numIslands(char[][] grid) {
        int n= grid.length, m = grid[0].length ;
        boolean vis[][] = new boolean[n][m] ;


        int cnt = 0 ;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0 ;j<m;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==false)
                {help(grid,i,j,vis) ;
                cnt++;
                }

            }
        }
        return cnt;
    }

    public void help(char[][] grid, int i,int j,boolean[][] vis){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0' || vis[i][j])
        return  ;

        vis[i][j] = true ;

        help(grid,i-1,j,vis) ;
        help(grid,i,j+1,vis) ;
        help(grid,i+1,j,vis) ;
        help(grid,i,j-1,vis) ;
    }
}
