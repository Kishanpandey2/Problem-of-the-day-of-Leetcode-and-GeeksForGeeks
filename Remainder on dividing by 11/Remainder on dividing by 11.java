class Solution 
{ 
    static int xmod11(String x)
	{    
	    int mod =  0 ;
	    int no  ;
	    for(int i =0 ;i<x.length() ;i++){
	        no= 0 ;
	        char ch = x.charAt(i) ;
	        no = mod * 10 + (ch-'0') ;
	        mod = no%11 ;
	        
	    }
	    return mod ;
        
	}
} 
