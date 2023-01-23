class Solution {
    public static String removePair(String s) {
        // code here
        Stack<Character>st = new Stack<>() ;
        if(s.length()==1)
        return s ;
        for(int i = 0 ;i<s.length() ;i++)
        {
            char ch = s.charAt(i) ;
            if(!st.isEmpty() && st.peek()==ch)
            st.pop() ;
            else
            st.push(ch) ;
        }
        String ans = "" ;
        while(!st.isEmpty())
        {
            ans = st.pop()+ans ;
        }
        if(ans.length()==0)
        return "-1" ;
        return ans ;
   
    }
}
       

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
