class Solution {
    public boolean validPartition(int[] nums) {
        int dp[] = new int[nums.length] ;
        Arrays.fill(dp,-1);
        int ans =  helper(nums,dp,0,nums.length) ;
        return (ans==1)?true:false;
    }
    private int helper(int []nums,int []dp, int i,int n){
        if(i>=n)return 1 ;

        if(dp[i]!=-1)return dp[i] ;

        if(i+1<n && nums[i]==nums[i+1])
        {
            dp[i] = helper(nums,dp,i+2,n) ;
            if(dp[i]==1)return 1 ;

            if(i+2<n && nums[i]== nums[i+2])
            { dp[i] = helper(nums,dp,i+3,n) ;
            if(dp[i]==1)return 1 ;
            }
        }

        if(i+2<n && nums[i+1]-nums[i]==1 && nums[i+2]-nums[i]==2)
        {
             dp[i] = helper(nums,dp,i+3,n) ;
            if(dp[i]==1)return 1 ;

        }

        return dp[i] = 0;
    }
}
