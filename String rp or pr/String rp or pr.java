class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
	    String str1 = "pr" , str2 = "rp";
	    
	    if(X<Y){
	        int t = X ;
	        X =  Y ;
	        Y = t ;
	        
	        String temp = str1 ;
	        str1 = str2 ;
	        str2 = temp ;
	    }
	    long result = 0 ;
	    Stack<Character>st = new Stack<>() ;
	    for(int i= S.length()-1 ;i>=0 ;i--){
	        
	        Character cur = S.charAt(i) , first = str1.charAt(0) ,second = str1.charAt(1) ;
	        
	        
	        if(st.size() > 0 && cur == first && st.peek() == second)
	        {
	            st.pop() ;
	            result += X ;
	        }
	        else
	        st.push(cur) ;
	    }
	    
	    StringBuilder rem_String = new StringBuilder() ;
	    while(st.size() > 0){
	        rem_String.append(st.pop()) ;
	        
	    }
	    
	    S = rem_String.toString() ;
	    
	    for(int i= S.length()-1 ;i>=0 ;i--){
	        
	        Character cur = S.charAt(i) , first = str2.charAt(0) ,second = str2.charAt(1) ;
	        
	        
	        if(st.size() > 0 && cur == first && st.peek() == second)
	        {
	            st.pop() ;
	            result += Y ;
	        }
	        else
	        st.push(cur) ;
	    }
        return result ;
	}
} 
