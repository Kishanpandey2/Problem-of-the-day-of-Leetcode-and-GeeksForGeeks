class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int [][]ans = new int[rowSum.length][colSum.length] ;

        for(int r = 0 ;r<rowSum.length;r++)
        {
            for(int c = 0;c<colSum.length;c++)
            {
                if(rowSum[r]==0 || colSum[c]==0)
                ans[r][c] = 0 ;
                else
                {
                int x = Math.min(rowSum[r],colSum[c]);
                ans[r][c ]= x ;
                rowSum[r]-= x;
                colSum[c]-= x;
                }
            }
        }   

        return ans;
    }
}
