class Solution {
    public int longestPalindrome(String s) {
        Set<Character>st =new HashSet<>() ;
        int ans = 0;
        for(char ch : s.toCharArray())
        {
            if(st.contains(ch))
            {
                ans += 2 ;
                st.remove(ch);
            }
            else
            st.add(ch);
        }

        return st.size()>0 ? ans+1:ans;
    }
}
