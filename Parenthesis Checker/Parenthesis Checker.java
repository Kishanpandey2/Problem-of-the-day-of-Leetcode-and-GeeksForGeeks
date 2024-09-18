
class Solution
{
   
    static boolean ispar(String x)
    {
       Stack<Character>st = new Stack<>() ;
       
       for(char ch :x.toCharArray() )
       {
           if(ch == '(' || ch == '{' || ch == '[')
           st.push(ch);
           else
           {
               if(st.isEmpty())return false;
               else if(ch == ')' && st.peek() == '(')
               st.pop() ;
               else if(ch == ']' && st.peek() == '[')
               st.pop() ;
               else if(ch == '}' && st.peek() == '{')
               st.pop() ;
               else
               return false;
           }
       }
       
       return st.isEmpty();
    }
}
