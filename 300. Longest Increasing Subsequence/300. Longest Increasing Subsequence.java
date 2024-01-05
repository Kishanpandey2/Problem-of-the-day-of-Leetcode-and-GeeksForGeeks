class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans  = 0 ;

        int []dp = new int[nums.length] ;
        dp[0] = 1;

        for(int i = 1;i<nums.length ;i++)
        {
            int mx = 0 ;
            for(int j = 0 ;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    if(dp[j]>mx)
                    mx = dp[j] ;
                }
            }

            dp[i] = mx+1 ;
        }

        for(int i : dp)
        if(i>ans)
        ans = i ;

        return ans;
    }
}
