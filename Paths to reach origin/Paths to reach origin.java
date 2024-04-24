
class Solution
{
    static int mod = (int)(1e9+7);
    public static int ways(int n, int m)
    {
        int [][]memo = new int[n+1][m+1] ;
        
        for(int []row : memo)
        Arrays.fill(row,-1) ;
        
        return dfs(n,m,memo);
    }
    public static int dfs(int x,int y,int [][]memo){
        if(x == 0 && y == 0)return 1 ;
        
        if(memo[x][y]!= -1)return memo[x][y] ;
        
        int cnt = 0 ;
        
        if(x >0)
        cnt =( cnt + dfs(x-1,y,memo))%mod ;
        
        if(y >0)
        cnt  = (cnt +dfs(x,y-1,memo)) %mod;
        
        return memo[x][y] = cnt ;
    }
}
