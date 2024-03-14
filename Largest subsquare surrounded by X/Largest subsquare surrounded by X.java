
class Solution {
    int largestSubsquare(int n, char a[][]) {
       int [][]rowSum = new int[n][n] ;
       int [][]colSum = new int[n][n] ;
       
       for(int i = 0 ;i<n;i++)
       {
           for(int j = 0 ;j<n;j++){
               rowSum[i][j] = (a[i][j]=='X'?(j==0 ?1:rowSum[i][j-1]+1):0);
               colSum[j][i] = (a[j][i]=='X'?(j==0 ?1:colSum[j-1][i]+1):0);
           }
       }
       
       
       int mx = 0 ;
       
       for(int i = n-1;i>=0;i--){
           for(int j = n-1;j>=0;j--){
               int size = Math.min(rowSum[i][j],colSum[i][j]) ;
               
               while(size>mx)
               {
                   if(rowSum[i-size+1][j]>=size && colSum[i][j-size+1]>=size)
                   {
                       mx =size ;
                       break;
                   }
                   else
                   size--;
               }
           }
       }
       return mx ;
    }
};
