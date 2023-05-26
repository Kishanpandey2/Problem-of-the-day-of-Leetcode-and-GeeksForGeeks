class Solution
{
    static final int mod = 1000000007;

    static int numOfWays(int n, int x)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=n;i++) 
        {
            int curr = (int) Math.pow(i, x);
           if(curr<=n)  al.add(curr); 
           else break;
            
        }
        //dp[n+1][n+1]
          int[][] dp = new int[n + 1][n + 1];
        for (int y[] :dp)
        Arrays.fill(y,-1);
        
        return help(al,0,n,al.size(),dp);
    }
    static int help(ArrayList<Integer> al, int i, int n, int size, int dp[][])
    {
        if(n<0)
        return 0;
        
        if(i==size)
        {
            if(n==0) return dp[i][n]=1;
            else return   dp[i][n]=0;
        }
        if(dp[i][n]!=-1) return dp[i][n];
        
        return dp[i][n] = ( help(al, i+1, n, size,dp)%mod +  help(al, i+1, n-al.get(i),size,dp)%mod)%mod;

    }
}
