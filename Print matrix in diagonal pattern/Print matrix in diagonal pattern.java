
class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length ;
        
        int []ans = new int[n*n] ;
        int ind = 0 ;
        int row = 0, col =  0;
        
        
        
        while(ind<(n*n)){
            // upwords 
            while(row>=0 && col<n){
                if(row>=0 && col<n && row<n && col>=0)
                {
                    ans[ind++]= mat[row][col] ;
                    mat[row][col] = 101;
                }
                row-- ; col++;
            }
            if(ind == n*n)break;
            
            row = Math.max(row,0) ;
            col = Math.min(col,n-1) ;
            
            while(mat[row][col]==101)
            row++;
            
            
            //downword
            while(row<n && col>=0){
                if(row>=0 && col<n && row<n && col>=0)
                {
                    ans[ind++]= mat[row][col] ; 
                    mat[row][col] = 101;
                }
                row++ ; col--;
            }
             if(ind == (n*n))break;
            row = Math.min(row,n-1) ;
            col = Math.max(col,0) ;
            
            while(mat[row][col]== 101)
            col++;
            
           
        }
        
        return ans;
        
    }
}
