class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums) ;

        int l = 0 , h = nums.length -1 ;

        int ans = Integer.MIN_VALUE ;

        while(l<h){
            ans = Math.max(ans,nums[l]+nums[h]) ;
            l++ ; h--;
        }

        return ans;
    }
}
