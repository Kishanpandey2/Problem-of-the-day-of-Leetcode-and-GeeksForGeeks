
class Solution{
  static void checkForOddEven(String s,int n,int container[], boolean even){
        for(int i = 0; i<n;i++){
            int l = i,r = i;
            if(even)l--;    // if evene length check even wise
            
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            
            r--; l++;
            
            int k = r-l+1;        // length of current string
            if(k>container[2]){
                container[2] = k;  //maxlength
                container[1] = r;  // end point of longest
                container[0] = l;  // start point of longest 
            }
        }
    }
    
    static String longestPalin(String s){
        int n = s.length();
        
        int container[]=new int[3];
        
        checkForOddEven(s,n,container,false);
        checkForOddEven(s,n,container,true);
        
        
        String res = "";
        for(int i = container[0]; i<=container[1]; i++)res += s.charAt(i);
        return res ;
    }
}
