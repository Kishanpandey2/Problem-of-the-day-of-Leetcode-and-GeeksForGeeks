
class Solution
{
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
     ArrayList<Integer> al = new ArrayList<>()  ;
     
     if(n == 1)
     {
         for(int col = 0 ;col<m;col++)
         al.add(matrix[0][col]) ;
     }
     else if(m == 1){
         for(int row = 0;row<n;row++)
        al.add( matrix[row][0] ) ;
     }
     else{
     for(int i = 0 ;i<m ;i++)
     al.add(matrix[0][i]) ;
     
     for(int i = 1 ;i<n  ;i++)
     al.add(matrix[i][m-1]) ;
     
     for(int i = m- 2;i>=0 ;i--)
     al.add(matrix[n-1][i]) ;
     
     for(int i = n - 2;i>=1;i--)
     al.add(matrix[i][0]) ;
     }
     
     return al ;
    }
}
