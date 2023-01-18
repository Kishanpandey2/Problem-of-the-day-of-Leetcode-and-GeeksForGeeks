class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0 ;
        int maxSum = Integer.MIN_VALUE ;
        int minSum = Integer.MAX_VALUE ;
        int maxEndingAt = 0 ;
        int minEndingAt = 0 ;
        for(int n :nums)
        {
            totalSum+=n ;
            maxEndingAt= Math.max(n,maxEndingAt+n) ;
            maxSum =Math.max(maxSum,maxEndingAt) ;
            minEndingAt= Math.min(n,minEndingAt+n) ;
            minSum =Math.min(minSum,minEndingAt) ;
        }
        if(maxSum>0)
        return Math.max(maxSum,totalSum-minSum) ;
        return maxSum ;
    }
}


Time Complexity -> O(n)
