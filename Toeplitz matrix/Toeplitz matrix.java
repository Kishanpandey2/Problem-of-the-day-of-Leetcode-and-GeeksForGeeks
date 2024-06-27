
class Solution {
    
    boolean isToeplitz(int mat[][]) {
        int n = mat.length, m = mat[0].length ;
         for(int i = 0 ;i<n-1;i++){
             for(int j = 0;j<m-1;j++){
              if(mat[i][j]!= mat[i+1][j+1])return false;
             }
         }
         
         return true;
    }
}
