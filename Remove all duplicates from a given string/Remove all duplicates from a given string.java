

class Solution {
    String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder() ;
        
        Set<Character>st = new HashSet<>() ;
        st.add(' ');
        
        for(int i= 0 ;i<str.length() ;i++)
        {
            if(!st.contains(str.charAt(i)))
           { sb.append(str.charAt(i)) ;
               st.add(str.charAt(i));
           }
          
        }
        
        return sb.toString() ;
    }
}

