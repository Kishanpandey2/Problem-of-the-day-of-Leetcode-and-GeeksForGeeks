class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>() ;

        for(int i : nums)
        map.put(i,map.getOrDefault(i,0)+1) ;

        int ans = 0 ;
        for(Integer i : map.values())
        {
            
        if(i == 1)return -1 ;

        ans += i/3 ;
        if( i%3 != 0)ans++;
        }

        return ans;
    }
}
