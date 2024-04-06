class Solution {
    public String minRemoveToMakeValid(String s) {
       Stack<Integer>st = new Stack<>() ;
        StringBuilder sb= new StringBuilder(s);
       for(int i = 0 ;i<s.length();i++)
       {
        if(s.charAt(i)=='(')
        {
            st.push(i) ;
        }
        else if(s.charAt(i)==')')
        {
            if(!st.isEmpty() && s.charAt(st.peek())=='(')
            st.pop();
            else
            st.push(i);
        }
       }

       while(!st.isEmpty()){
        int ind = st.pop() ;
        sb.deleteCharAt(ind);
       }

       return sb.toString();
    }
}
