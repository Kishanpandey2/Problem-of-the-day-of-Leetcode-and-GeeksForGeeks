class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length , n = grid[0].length ;
        int [][]ans = new int[m][n] ;

        int []onesRow = new int[m] ;
        int []zerosRow =  new int[m] ;
        int []onesCol = new int[n] ;
        int []zerosCol = new int[n] ;


        for(int i =0 ;i<m;i++){
            for(int j = 0 ;j<n;j++){
                if(grid[i][j] == 1)
                {
                    onesRow[i]++  ;
                    onesCol[j]++ ;
                }
                 if(grid[i][j] == 0)
                {
                    zerosRow[i]++  ;
                    zerosCol[j]++ ;
                }
            }
        }

        for(int i = 0 ;i<m;i++){
            for(int j = 0 ;j<n;j++){
                ans[i][j] = onesRow[i]+onesCol[j] - zerosRow[i]-zerosCol[j] ;
            }
        }

        return ans ;
    }
}
