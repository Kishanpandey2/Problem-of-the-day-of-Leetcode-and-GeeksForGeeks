class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length] ;
        List<Integer>al = new ArrayList<>() ;

        for(int i : nums)
        if(i<0)
        al.add(i) ;

        int ind = 0 , cnt = 0 ;

        for(int i: nums)
        {
            if(i>=1)
            {
                ans[ind++] =  i;
                ans[ind++] = al.get(cnt++) ;
            }
        }

        return ans;
    }
}
