class Solution {
    private int solve(int [][]dp,int [][]tm ,int index,int prev){
        if(index==tm.length)
        return 0 ;
        if(dp[prev+1][index]!=-1)
        return dp[prev+1][index] ;
        if( prev==-1 || tm[prev][1]<=tm[index][1])
        {
            return dp[prev+1][index]= Math.max(tm[index][1]+solve(dp,tm,index+1,index),solve(dp,tm,index+1,prev)) ;
        }
        return solve(dp,tm,index+1,prev) ;
    }
    public int bestTeamScore(int[] scores, int[] ages) {
        int len = ages.length ;
        int [][]tm = new int[len][2];
        for(int i = 0 ;i<len;i++){
            tm[i][0]= ages[i] ;
            tm[i][1]= scores[i] ;
        }
        int [][]dp = new int[len][len] ;
        for(int []i:dp){
            Arrays.fill(i,-1) ;
            
        }
        Arrays.sort(tm, (a,b) -> a[0]==b[0]? a[1]-b[1] : a[0]-b[0]);
        return solve(dp,tm,0,-1) ;
    }
}
