
class Solution{
    static int [][]dp  ;
    
    static int minimumNumberOfDeletions(String S) {
        
        int n = S.length() ;
        
        dp = new int[n][n] ;
        
        for(int i[] : dp)
        Arrays.fill(i,-1) ;
        
         return help(S,0,S.length()-1) ;
         
    }
    
    static int help(String s,int i,int j){
        if(i>=j)return 0 ;
        
        if(dp[i][j]!= -1)return dp[i][j] ;
        
        if(s.charAt(i) == s.charAt(j))
        return   dp[i][j] = help(s,i+1,j-1) ;
        
        return   dp[i][j]  = 1+ Math.min(help(s,i+1,j),help(s,i,j-1)) ;
    }
}
