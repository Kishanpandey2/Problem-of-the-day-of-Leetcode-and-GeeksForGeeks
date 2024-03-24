class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> ans = new Stack<>() ;
        while(!st.isEmpty())
        ans.push(st.pop()) ;
        
        st.push(x) ;
        
        while(!ans.isEmpty())
        st.push(ans.pop());
        
        return st;
    }
}
