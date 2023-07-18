
class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int dp[][]=new int[str.length()+1][str.length()+1];
        for(int i=0;i< dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
            }
        }
        for(int i=1;i< dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++)
            {
                if(str.charAt(i-1)==str.charAt(j-1) && i!=j)
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[str.length()][str.length()];
    }
}
