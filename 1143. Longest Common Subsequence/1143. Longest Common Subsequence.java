class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         int x = text1.length() ;
        int y =  text2.length() ;
      int [][]dp = new int[x+1][y+1] ;
   
        return   lcsUtil(x,y,text1,text2,dp) ;
    }

     int lcsUtil(int x,int y , String s1,String s2, int[][]dp){
        for(int i = 1 ;i<=x;i++){
            for(int j = 1 ;j<=y;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1]+1 ;
                else
                dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]) ;
            }
           
        }
         return dp[x][y] ;
    }
}
