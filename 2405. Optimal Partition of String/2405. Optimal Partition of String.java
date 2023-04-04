class Solution {
    public int partitionString(String s) {
        Set<Character>st = new HashSet<>() ;
            int cnt = 0  ;
            for(char c  : s.toCharArray()){
                if(st.contains(c))
                {
                    cnt++ ;
                    st = new HashSet<>() ;
                    st.add(c) ;
                }
                else
                {
                    st.add(c) ;
                }
            }

            if(!st.isEmpty())
            cnt++ ;

            return cnt ;
    }
}
