
class Solution {
    static int checkCompressed(String S, String T) {
        int no = 0 , j =0 ;
       
        for(int i = 0 ;i<T.length() ;i++){
            char ch = T.charAt(i) ;
            if (ch>='0' && ch <='9')
            {no = no * 10 + (ch-'0') ;
            j--;}
            else
            {
                j = j+no ;
                if(ch != S.charAt(j) )
                return 0 ;
                no = 0 ;
            }
            j++;
        
        }
         j = j+no ;
         if(j!=S.length())
         return 0 ;
        return 1 ;
    }
}
