
class Solution {
    int isDivisible(String s) {
         int no = 0;
        
	    for(int i =0 ;i<s.length();i++)
	    {
	        if(s.charAt(i ) == '1'){
	            if(i%2==0)
	            no+=1;
	            else
	            no+=2 ;
	        }
	        
	    }
	  
	    return (no%3==0)?1:0;
    }
}
