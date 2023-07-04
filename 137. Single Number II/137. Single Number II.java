class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1)
        return nums[0];
     Map<Integer,Integer>map = new HashMap<>() ;
    for(int i :nums)
    map.put(i,map.getOrDefault(i,0)+1);

    int ans = 0 ;
        for(Map.Entry<Integer,Integer>entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {ans = entry.getKey();break;}
        }
        return ans; 
    }
}
