class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder() ;
        Stack<String>st = new Stack<>() ;
        String p [] = path.split("/") ;
        for(int i = 0 ;i<p.length ;i++){
          
            if(!st.isEmpty() && p[i].equals(".."))
            st.pop() ;
           else if(!p[i].equals("" ) && !p[i].equals(".") && !p[i].equals(".."))
           st.push(p[i]) ;
        }
       if(st.isEmpty())
        return "/" ;
        while(!st.isEmpty())
        sb.insert(0,st.pop()).insert(0,"/") ;

        return sb.toString() ;
    }
}
