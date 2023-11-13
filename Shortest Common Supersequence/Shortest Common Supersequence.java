class Solution
{
 
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
         return m+n-lcs(m,n,X,Y);
    }
    static int lcs(int x, int y, String s1, String s2)
    { 
        int [][]dp =  new int[x+1][y+1] ;
        for(int i = 0 ;i<=x;i++)
        {
            for(int j = 0 ;j<=y;j++)
            {
                if(i== 0 ||j==0 )
                dp[i][j] = 0 ;
                else if(s1.charAt(i-1)== s2.charAt(j-1) )
                dp[i][j] = 1+ dp[i-1][j-1] ;
                else
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[x][y];
    
    }
 
}
