class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>() ;

        int length = 0 , sum = 0 ;
        for(int i = 0 ;i<nums.length;i++)
        {
            sum += (nums[i]==0)?-1:1 ;

            if(sum == 0 )
            length = Math.max(length,i+1) ;

            else if(map.containsKey(sum))
            length = Math.max(length, i-map.get(sum)) ;
            else
            map.put(sum,i);
        }

        return length;
    }
}
