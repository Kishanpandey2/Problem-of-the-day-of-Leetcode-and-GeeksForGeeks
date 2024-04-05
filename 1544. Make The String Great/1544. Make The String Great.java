class Solution {
    public String makeGood(String s) {
        Stack<Character>st =new Stack<>() ;

        StringBuilder sb = new StringBuilder() ;
        for(int i = 0 ;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!st.isEmpty() && Math.abs(ch-st.peek() )== 32 )
                st.pop() ;
                     else
            st.push(ch);
        }


        while(!st.isEmpty())
        sb.append(st.pop()) ;

        return sb.reverse().toString();
    }
}
