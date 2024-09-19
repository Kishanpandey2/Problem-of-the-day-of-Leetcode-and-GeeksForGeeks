
class Solution {
  
    String reverseWords(String str) {
     StringBuilder ans = new StringBuilder() ;
     Stack<String>st = new Stack<>() ;
     int i = 0 ;
     
     while(i<str.length() ){
         StringBuilder temp =new StringBuilder() ;
         
         while(i<str.length() && str.charAt(i)!= '.'){
             char ch = str.charAt(i);
             temp.append(ch);
             i++;
         }
         i++;
         
         st.push(temp.toString());
     }
     
     while(!st.isEmpty())
     {
         String temp = st.pop();
         if(st.isEmpty())
         ans.append(temp);
         else
         ans.append(temp +".");
     }
     return ans.toString();
    }
}
