class Solution {
    public int[][] largestLocal(int[][] grid) {
        int [][]ans = new int[grid.length-2][grid.length-2] ;

        for(int i = 0 ;i<ans.length;i++)
        {
            for(int j = 0 ;j<ans.length;j++)
            ans[i][j] = help(grid,i,j);
        }

        return ans ;
    }

    int help(int [][]grid,int i,int j){
        int mx = 0;
        for(int row = i;row<i+3;row++ )
        {
            for(int col = j;col<j+3;col++)
            mx = Math.max(grid[row][col],mx);
        }

        return mx;
    }
}
