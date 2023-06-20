class Solution {
    public int[] getAverages(int[] nums, int k) {
        int windowSize = 2 * k + 1 ;
        int n = nums.length ;
        int []ans = new int[n] ;
        Arrays.fill(ans,-1);
        if(n<windowSize)
        return ans ;
        long windowSum =0 ;
        for(int i = 0 ;i<n;++i)
    {
            windowSum += nums[i]; // Add nums[i] to the window sum

            if (i - windowSize >= 0) {
                windowSum -= nums[i - windowSize]; // Remove nums[i - windowSize] from the window sum
            }

            if (i >= windowSize - 1) {
                ans[i - k] = (int) (windowSum / windowSize); // Calculate and store the average in the result
            }
    }
    return ans;
    }
}
