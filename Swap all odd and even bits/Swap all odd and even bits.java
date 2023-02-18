class Solution
{
   
    public static int swapBits(int n) 
    {
	    StringBuilder sb= new StringBuilder() ;
    while(n!=0){
        int odd = ((n&1)!=0)?1:0 ;
        n>>=1 ;
        int even = ((n&1)!=0)?1:0 ;
        n>>=1 ;
        int t = odd ;
        odd = even ;
        even = t ;
        sb.append(odd+""+even) ;
    }
    int ans =0 ;
     for(int i = 0 ;i<sb.length() ;i++){
                if(sb.charAt(i)=='1')
                    ans = ans+  (int)Math.pow(2,i) ;
            }
            
            return ans ;
    
	}
    
}
