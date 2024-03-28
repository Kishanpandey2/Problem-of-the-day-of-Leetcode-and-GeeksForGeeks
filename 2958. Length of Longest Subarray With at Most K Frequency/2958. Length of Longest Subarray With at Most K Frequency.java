class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer>map = new HashMap<>();
        int st = 0,end = 0  ;
        int mx = 0 ;
        while( end < nums.length && st<nums.length)
       {
        map.put(nums[end],map.getOrDefault(nums[end],0)+1) ;

        while( map.get(nums[end])>k)
        {

            map.put(nums[st],map.get(nums[st])-1) ;

            st++;
        }
        mx= Math.max(mx,end-st+1) ;

        end++;
       }
       return mx ;
       

    }
}
