class Solution
{
    public int longestPalinSubseq(String S)
    {
     StringBuilder sb = new StringBuilder(S) ;
     sb = sb.reverse() ;
     int n = S.length() +1 ;
     int [][]dp = new int[n][n] ;
     for(int i = 0 ;i<n;i++ )
     {
         for(int j = 0 ;j<n;j++)
         {
             if(i==0 || j==0)
             dp[i][j]= 0 ;
             else if(S.charAt(i-1)==sb.charAt(j-1))
             dp[i][j]= 1+ dp[i-1][j-1] ;
             else
             dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) ;
         }
     }
     return dp[n-1][n-1];
    }
}
