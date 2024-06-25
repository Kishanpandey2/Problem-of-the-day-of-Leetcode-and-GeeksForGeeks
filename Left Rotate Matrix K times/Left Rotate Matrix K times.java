
class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        
        k = k%mat[0].length ;
        
        if(k == 0)return mat;
        
        int [][]ans = new int[mat.length][mat[0].length];
        
        for(int i = 0;i<mat.length;i++)
        {
            int x = 0 ;
            
            for(int j  = k;j<mat[0].length;j++,x++)
            {
                ans[i][x]  = mat[i][j];
            }
            
            
            for(int j  = 0;j<k;j++,x++)
            {
                ans[i][x]  = mat[i][j];
            }
        }
        
        return ans;
    }
}
