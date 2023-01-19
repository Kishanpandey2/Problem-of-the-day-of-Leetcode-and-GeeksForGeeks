class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer>map = new HashMap<>() ;
        int r = 0 , sum = 0  ;
        map.put(0,1) ;
        int ans = 0 ;
        for(int n:nums)
        {
            sum+=n ;
            r = sum % k  ;
            if(r<0)
            r+=k ;
            if(map.containsKey(r))
           { ans+=map.get(r) ;
           map.put(r,map.get(r)+1) ;
           }
           else
           map.put(r,1) ;
            
        }
        return ans ;
    }
}

Time Complexity : O(n) 
Space Complexity : O(n) 
