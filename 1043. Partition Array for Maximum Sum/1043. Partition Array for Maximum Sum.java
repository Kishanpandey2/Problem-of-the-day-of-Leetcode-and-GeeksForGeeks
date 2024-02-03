class Solution {
    int []dp ;
    public int maxSumAfterPartitioning(int[] arr, int k) {
          dp = new int[arr.length+1] ;

         Arrays.fill(dp,-1) ;

        return help(0,arr,k);
    }
    int help(int ind ,int []arr,int k)
    {
        if(ind == arr.length)return 0;

        if(dp[ind] != -1)return dp[ind] ;
        int maxAns = 0 , max = 0, len = 0  ;

        for(int j = ind ;j<Math.min(arr.length, ind+ k) ;j++)
        {
            len++;
            max = Math.max(max, arr[j]) ;

            int sum = len*max + help(j+1,arr,k) ;

            maxAns = Math.max(maxAns,sum) ;
        }   

        return dp[ind]=maxAns;
    }
}
