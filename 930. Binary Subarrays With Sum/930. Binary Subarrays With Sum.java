class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer>map = new HashMap<>() ;
            int ans = 0 ;
        int ps = 0 ;
        map.put(0,1);
        for(int i : nums)
        {
            ps += i ;

            ans += map.getOrDefault(ps-goal,0);
            map.put(ps,map.getOrDefault(ps,0)+1) ;
        }
        return ans;
    }
}
