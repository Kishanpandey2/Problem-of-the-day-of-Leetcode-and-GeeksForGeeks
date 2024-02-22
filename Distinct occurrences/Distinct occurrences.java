class Solution
{
    int mod = (int )(1e9+7) ;
    int [][]dp ;

    int  subsequenceCount(String s, String t)
    {
        int n = s.length() ;
        int m = t.length();
        
         dp = new int[n+1][m+1] ;
        
        for(int i[]:dp)
        Arrays.fill(i,-1) ;
        
        
       return help(0,0,s,t) ;
    }
    
    int help(int i,int j ,String s, String t){
        if(j == t.length())return 1;
        if(i == s.length() ) return 0 ;
        
        if(dp[i][j]!= -1)return dp[i][j] ;
        
        
        int take = 0 ;
        if(s.charAt(i)== t.charAt(j))
        {
            take = help(i+1,j+1,s,t) ;
        }
        int noTake = help(i+1,j,s,t);
        
        return dp[i][j] = (take+noTake)%mod;
    }
}
