class Solution {
    public int strangePrinter(String s) {
        int n = s.length() ;
        int [][]dp = new int[n ][n] ;

        for(int []i : dp)
        Arrays.fill(i,-1) ;

       return  help(0,n-1,s,dp);
    }

    private int help(int i ,int j , String s, int [][]dp){
        if(i==j)return 1;

        if(dp[i][j]!=-1)return dp[i][j] ;

        int min = Integer.MAX_VALUE ;

        for(int p = i;p<j;p++)
        {
            min =Math.min(min, help(i,p,s,dp)+help(p+1,j,s,dp));
        }

        return dp[i][j]= (s.charAt(i)==s.charAt(j))?min-1 : min ;
    }
}
