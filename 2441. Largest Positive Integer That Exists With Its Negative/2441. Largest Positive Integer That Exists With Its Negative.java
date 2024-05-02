class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer>st  = new HashSet<>() ;

        for(int i : nums)st.add(i);

            int ans = -1 ;

        for(int i : nums)
        {
            if(i>ans && st.contains(-i))ans = i; 

        }

        return ans;
    }
}
