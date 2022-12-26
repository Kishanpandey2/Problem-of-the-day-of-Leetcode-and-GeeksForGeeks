class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length ;
        int canReach = 0 ;
        for(int i = 0 ;i<len;i++)
        {
            if(canReach<i)
            return false ;
            canReach = Math.max(canReach, i+nums[i]) ;
        }
        return true;
    }
}
