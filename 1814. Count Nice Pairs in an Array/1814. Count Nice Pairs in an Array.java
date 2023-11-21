class Solution {
    int mod = 1000000007 ;
    public int countNicePairs(int[] nums) {
        int ans = 0 ;
        Map<Integer,Integer>map = new HashMap<>() ;

        for(int i = 0 ;i<nums.length;i++)
        { 
            int curNo = nums[i] ;
            int curNoRev = reverse(curNo) ;
            int dif = curNo - curNoRev ;

            if(map.containsKey(dif))
            ans = (ans+map.get(dif))%mod ;

            map.put(dif,map.getOrDefault(dif,0)+1) ;

        }

        return ans;
    }
    int reverse(int n)
    {
        if( n <=9)return n ;
        int rev = 0 ;
        while(n>0)
        {
            int rem = n%10 ;
            rev = rev*10+ rem ;
            n/=10;
        }

        return rev ;
    }
}
