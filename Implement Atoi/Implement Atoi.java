class Solution
{
    int atoi(String s) {
	
	    
	    long ans = 0 ;
	    
	    for(int i = 0;i<s.length() ;i++){
	        
	        char ch = s.charAt(i) ;
	        
	        if(ch == '-' && i == 0)continue;
	        if(ch >= '0' && ch <='9')
	        ans = ans*10+(ch-'0');
	        else
	        return -1 ;
	    }
	    
	    if(s.charAt(0)=='-')
	    ans *= -1 ;
	    
	    return (int)ans;
    }
}
