class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0 , j;
        int ans = Integer.MAX_VALUE ;
            int curSum = 0 ;
        for(  j = 0 ;j<nums.length;j++)
        {
             
                curSum+=nums[j] ;
          
            while(curSum>=target)
            {
                 ans = Math.min(ans,j-i+1);
                curSum -= nums[i] ; i++ ;
            }
        }
        

        return (ans!=Integer.MAX_VALUE )?ans:0;
    }
}
