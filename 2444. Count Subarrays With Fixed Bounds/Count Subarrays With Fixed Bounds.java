class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0; 
    int j = -1; 
    int prevMinKIndex = -1; 
    int prevMaxKIndex = -1;

    for (int i = 0; i < nums.length; ++i) { 
      if (nums[i] < minK || nums[i] > maxK)
        j = i; 
      if (nums[i] == minK)
        prevMinKIndex = i; 
      if (nums[i] == maxK)
        prevMaxKIndex = i; 
     
      res += Math.max(0, Math.min(prevMinKIndex, prevMaxKIndex) - j);
    }

    return res;
    }
}
