// Method 1  using ArrayList


class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        ArrayList<Integer>al = new ArrayList<>() ;
        while(!s.isEmpty())
        al.add(s.pop());
        
         for(int  i = 0 ;i<al.size() ;i++)
        s.add(al.get(i));
    }
}


// Method 2 using Recursion 


class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        help(s);
    }
    static void help(Stack<Integer>st){
        
       if(st.size()==1)return ;
       
       int t = st.pop();
       help(st) ;
       insert(st,t) ;
        
    }
    static void insert(Stack<Integer>st, int ele)
    {
        if(st.size() ==0 )
        {st.add(ele) ;
        return ;
        }
        
        int temp = st.pop() ;
        insert(st,ele) ;
        st.add(temp) ;
    }
}
