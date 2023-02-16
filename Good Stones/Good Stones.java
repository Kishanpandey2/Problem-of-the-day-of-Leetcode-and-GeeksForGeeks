
class Solution {
    static int []dp ;
    public static int goodStones(int n, int[] arr) {
    dp = new int[n] ;
       for(int i = 0 ;i<n;i++){
           if(dp[i]==0){
              dp[i]= solution(arr,n,i) ;
           }
       }
       int res = 0 ;
       for(int no:dp)
       if(no==2)
       res++ ;
       
       return res ;
    }
    static int solution(int []arr,int n , int index){
        if(index<0 || index>=n)
        return 2 ;
        if(dp[index]==1 || dp[index]==2)
        return dp[index] ;
        dp[index] = 1 ;
      return dp[index]=   solution(arr,n,index+arr[index]);
        
    }
}
        
