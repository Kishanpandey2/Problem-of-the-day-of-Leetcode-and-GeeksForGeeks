class Solution {
    public long minCost(int[] nums, int[] cost) {
        long left  = Long.MAX_VALUE;
        long right = Long.MIN_VALUE ;
        long ind = 0 ;

        for(int i = 0 ;i<nums.length ;i++)
        {
            left = Math.min(left,nums[i]);
            right = Math.max(right,nums[i]);
        }
        while(left <= right){
            long mid = left+(right - left)/2;
            if(help(nums,mid,cost)<help(nums,mid+1,cost))
            {
                ind = mid ;
                right = mid - 1;
            }
            else
            left = mid+1;
        }
        return help(nums,ind,cost);
    }
    long help(int []nums,long mid, int []cost){
        long totalSum = 0 ;
        for(int i = 0 ;i<nums.length;i++)
        {
            totalSum+=Math.abs(nums[i]-mid)*cost[i];
        }
        return totalSum;
    }
}
