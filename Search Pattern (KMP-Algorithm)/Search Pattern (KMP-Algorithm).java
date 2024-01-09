

class Solution
{
    void fillLps(String pat , int []lps){
        int i = 1 ;
        lps[0] = 0 ;
        
        int len = 0 ;
        
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len))
            {
                len++ ;
                lps[i]  = len ;
                i++;
            }
            else
            {
                if(len == 0)
                {
                    lps[i] = 0 ; i++;
                }
                else
                len = lps[len-1] ;
            }
        }
    }
    
    ArrayList<Integer> search(String pat, String txt)
    {
        int n = txt.length() , m = pat.length() ;
        ArrayList<Integer>al = new ArrayList<>() ;
        int []lps = new int[m] ;
        
        fillLps(pat,lps) ;
        
        int i = 0 , j = 0 ;
        
        while(i<n){
            if(pat.charAt(j) == txt.charAt(i))
            {
                i++ ; j++;
            }
            
            if(j == m )
            {
                al.add(i-j+1) ;
                j = lps[j-1];
            }
            else if(i<n && pat.charAt(j)!= txt.charAt(i))
            {
                if( j== 0 )i++ ;
                else
                j = lps[j-1] ;
            }
        }
        
        return al;
        
        
    }
}
