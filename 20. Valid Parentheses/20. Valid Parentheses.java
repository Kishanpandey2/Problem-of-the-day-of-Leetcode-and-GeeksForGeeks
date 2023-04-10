class Solution {
    public boolean isValid(String str) {
        Stack<Character>s  = new Stack<>() ;
        for(int i = 0  ;i<str.length();i++)
        {
            char cur = str.charAt(i) ;
            if(isOpening(cur))
                s.push(cur) ;
            else
            {
                if(s.isEmpty())
                    return false ;
                else if(!isMatching(s.peek(),cur))
                {
                return false;
                }
                else
                    s.pop();
            }
            
        }
        if(s.isEmpty())
                return true ;
            else
                 return false ;
    }
    public boolean isOpening(char c)
    {
        return (c=='(' || c=='{' || c=='[') ;
    }
    public boolean isMatching(char a ,char b)
    {
        return ((a=='(' && b==')')|| (a=='{' && b=='}')||(a=='[' && b==']'));
    }
}
