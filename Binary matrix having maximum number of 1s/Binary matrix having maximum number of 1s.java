class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        int maxOnes  = 0  ;
        int rowNo = 0 ;
        int c ;
       for(int i =  0 ;i<mat.length ;i++){
           c= 0 ;
           for(int j = 0 ;j<mat[0].length ;j++){
               if(mat[i][j]==1)
               c++ ;
           }
           if(c>maxOnes)
           {
                 maxOnes = c ;
                 rowNo = i ;
           }
         
       }
       int []ans = new int[2] ;
       
       ans[0] = rowNo ;
       ans[1] = maxOnes ;
       
       
       return ans ;
    }
};
