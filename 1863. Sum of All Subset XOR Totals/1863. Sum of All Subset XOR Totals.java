class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }
    
    private int dfs(int[] nums, int index, int currentXor) {
        // Base case: when all elements have been considered
        if (index == nums.length) {
            return currentXor;
        }
        // Include nums[index] in the subset
        int include = dfs(nums, index + 1, currentXor ^ nums[index]);
        // Exclude nums[index] from the subset
        int exclude = dfs(nums, index + 1, currentXor);
        return include + exclude;
    }
}
