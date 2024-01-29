class MyQueue {
    Stack<Integer>st1 ;
    Stack<Integer>st2 ;
    public MyQueue() {
        st1 = new Stack<>() ;
        st2  = new Stack<>() ;
        
    }
    
    public void push(int x) {
        st1.push(x) ;
    }
    
    public int pop() {
        while(st1.size()>1)
        st2.push(st1.pop())  ;

        int ans = st1.pop() ;

        while(!st2.isEmpty())
        st1.push(st2.pop()) ;

        return ans ;
    }
    
    public int peek() {
          while(st1.size()>1)
        st2.push(st1.pop())  ;

        int ans = st1.peek() ;

        while(!st2.isEmpty())
        st1.push(st2.pop()) ;

        return ans ;
    }
    
    public boolean empty() {
        return st1.size() ==0 ;
    }
}
