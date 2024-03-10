class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer>st = new HashSet<>() ;
            
        List<Integer>l = new ArrayList<>() ;
        int ind = 0 ;

        for(int i : nums1)
        st.add(i) ;

        for(int i : nums2)
        {
            if(st.contains(i))
            {
                l.add(i) ; st.remove(i) ;
            }
        }

        

        int []ans = new int[l.size() ] ;

        for(int i = 0 ;i<l.size() ;i++)
        ans[i] = l.get(i);

        return ans;
    }
}
