
class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
       int []row = new int[N] ;
       int []col = new int[N] ;
       int max =Integer.MIN_VALUE ;
       int c = 0 ;
       
       for(int i = 0 ;i<N;i++)
       {
           for(int  j = 0 ;j<N;j++)
           {
               row[i] += matrix[i][j] ;
               col[j] += matrix[i][j] ;
               max = Math.max(max, row[i]);
               max = Math.max(max, col[j]);
               
           }
       }
       
       int diff = 0 ;
       
       for(int r : row)
       {
           diff += (max-r) ;
       }
       
       return diff;
    }
}
        
