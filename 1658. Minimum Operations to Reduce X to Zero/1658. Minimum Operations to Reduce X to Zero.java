// Method 1 Using Map

class Solution {
    public int minOperations(int[] nums, int x) {
     Map<Integer,Integer>map = new HashMap<>() ;
     map.put(0,-1) ;
     int target = -x ;

     
     for(int i : nums)
     target+= i ;

        if(target == 0)return nums.length ;
        int ans = -1 ;
        int sum = 0  ;
        for(int i = 0 ;i<nums.length ;i++ ){
            sum += nums[i] ;

            if(map.containsKey(sum - target))
            ans = Math.max(ans, i - map.get(sum - target)) ;

            map.put(sum , i ) ;
        }

        return ans == -1?-1: nums.length - ans ;
    }
}


// Method 2 using Two Pointer Approach 
class Solution {
    public int minOperations(int[] nums, int x) {
     Map<Integer,Integer>map = new HashMap<>() ;
     map.put(0,-1) ;
     int target = -x ;

     
     for(int i : nums)
     target+= i ;

        if(target == 0)return nums.length ;
        int ans = -1 ;
        int sum = 0  ;
        for(int i = 0 ;i<nums.length ;i++ ){
            sum += nums[i] ;

            if(map.containsKey(sum - target))
            ans = Math.max(ans, i - map.get(sum - target)) ;

            map.put(sum , i ) ;
        }

        return ans == -1?-1: nums.length - ans ;
    }
}
