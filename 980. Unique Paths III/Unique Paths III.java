class Solution {
    public int uniquePathsIII(int[][] grid) {
        int z = 0 , dx = 0 , dy = 0 ;
        for(int row=0 ; row<grid.length ;row++)
        {
            for(int col=0;col<grid[0].length;col++)
            {
                if(grid[row][col]==0)
                z++;
                else if(grid[row][col]==1)
                {
                    dx = row ;
                    dy = col ;
                }
            }
        }
        return dfs(grid, dx ,dy , z) ;
    }
    public int dfs(int [][]grid, int i,int j, int z)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]== -1)
        return 0;
         if(grid[i][j]==2)
         return z==-1?1:0 ;
         grid[i][j]=-1;
         z--;
         int overallpath = dfs(grid,i+1,j,z)+dfs(grid,i,j+1,z)+dfs(grid,i-1,j,z)+dfs(grid,i,j-1,z);
         grid[i][j]=0 ;
         z++;
         return overallpath ;
    }
}
