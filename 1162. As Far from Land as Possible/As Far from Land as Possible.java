class Solution {
    public int maxDistance(int[][] grid) {
        int n =grid.length;
        int m = grid[0].length;
        int x = m+n;
        //top-left
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    continue;
                }
                int top = x;
                int left = x;
                if(i-1>=0){
                    top = grid[i-1][j];
                }
                if(j-1>=0){
                    left = grid[i][j-1];
                }
                grid[i][j] = Math.min(top,left)+1;
            }
        }
        //bottom-right;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(grid[i][j]==1){
                    continue;
                }
                int bottom =x;
                int right = x;
                if(i+1<n){
                    bottom = grid[i+1][j];
                }
                if(j+1<m){
                    right = grid[i][j+1];
                }
                grid[i][j] = Math.min(grid[i][j],Math.min(bottom,right)+1);
            }
        }
        int max_ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max_ans = Math.max(max_ans,grid[i][j]);
                }
            }
           if(max_ans-1==x+1 || max_ans-1==0){
               return -1;
           }
           return max_ans-1;           
    }
}
