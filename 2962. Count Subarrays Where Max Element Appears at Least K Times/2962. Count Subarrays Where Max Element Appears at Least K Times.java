class Solution {
    public long countSubarrays(int[] nums, int k) {
        int mx = 0 ;

        Map<Integer,Integer>map = new HashMap<>() ;
        for(int i : nums)
        {
            mx = Math.max(mx,i) ;
         
        }

       

        long ans = 0 ;

        int st = 0 , end = 0 ;

        while(end<nums.length && st<nums.length)
        {
             map.put(nums[end],map.getOrDefault(nums[end],0)+1) ;
            
            while(map.containsKey(mx) && map.get(mx)>=k){
                ans += nums.length - end;
                map.put(nums[st],map.get(nums[st])-1);
                st++;
                 }
           
            end++;

        }

        return ans;
    }
}
