class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
            return atMostK(nums,k)-atMostK(nums,k-1);

    }

    int atMostK(int []nums, int k){
        Map<Integer,Integer>map =new HashMap<>() ;

        int st = 0, ans = 0   ;

        for(int end = 0 ;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1) ;

            while(map.size()>k){
                if(map.get(nums[st])>1)
                map.put(nums[st],map.get(nums[st])-1) ;
                else
                map.remove(nums[st]) ;

                st++;
            }

            ans += (end-st+1) ;
        }
        return ans;
    }
}
