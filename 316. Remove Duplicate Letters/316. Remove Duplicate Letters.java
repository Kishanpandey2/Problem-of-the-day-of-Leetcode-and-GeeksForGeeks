class Solution {
    public String removeDuplicateLetters(String s) {
        int lastInd[] = new int[26] ;
        boolean vis[] = new boolean[26] ;
        StringBuilder sb = new StringBuilder() ;
        Stack<Integer>st = new Stack<>() ;
        for(int i = 0 ;i<s.length() ;i++)
        lastInd[s.charAt(i)-'a']= i  ;

        
        for(int i = 0 ;i<s.length();i++)
        {
            int ch = s.charAt(i)-'a' ;

        if(vis[ch])continue ;

        vis[ch] = true ;
        while(!st.isEmpty() && ch<st.peek() && lastInd[st.peek()]>i)
        vis[st.pop()]= false ;

        st.push(ch) ;
        }
        
        for(int i : st)
        sb.append((char)(i+'a')) ;

        return sb.toString() ;
    }
}
