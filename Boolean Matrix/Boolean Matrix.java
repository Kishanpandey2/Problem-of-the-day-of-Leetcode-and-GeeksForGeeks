// Method 1 
class Solution
{
    void booleanMatrix(int matrix[][])
    {
        int []r = new int[matrix.length ]  ;
        int c[] = new int[matrix[0].length] ;
        
        for(int i = 0;i<r.length;i++){
            
            for(int j = 0 ;j<c.length ;j++)
            if(matrix[i][j] == 1)
            {
                r[i] = 1  ; c[j] = 1 ;
            }
        }
        
         
        for(int i = 0;i<r.length;i++){
            
            for(int j = 0 ;j<c.length ;j++)
            if(r[i] ==1 || c[j] ==1)
            {
                matrix[i][j] = 1  ;
            }
        }
        
        
    }
}
