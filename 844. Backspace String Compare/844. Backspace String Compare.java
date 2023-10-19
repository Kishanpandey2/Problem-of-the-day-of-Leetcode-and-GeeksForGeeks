class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st1 = new Stack<>() ;
        Stack<Character>st2 = new Stack<>() ;

        int i = 0;
        while(i<s.length())
        {
            if(s.charAt(i)!='#')
            st1.push(s.charAt(i)) ;
            else
            {
                if(!st1.isEmpty())
                st1.pop();
            }

            i++;
        }
            i =  0 ;
            while(i<t.length())
        {
              if(t.charAt(i)!='#')
            st2.push(t.charAt(i)) ;
            else
            {
                if(!st2.isEmpty())
                st2.pop();
            }

            i++;
        }


        while(!st1.isEmpty() && !st2.isEmpty()){
            char ch1 = st1.pop() ;
            char ch2 = st2.pop() ;

            if(ch1!=ch2)return false;
        }

        if(!st1.isEmpty() || !st2.isEmpty())return false;
        return true ;
    }
}
