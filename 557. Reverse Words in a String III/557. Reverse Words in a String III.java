class Solution {
    public String reverseWords(String s) {
        int  i =0 , j = 0 ;
        StringBuilder sb = new StringBuilder() ;

            while(i< s.length()){
                while(j<s.length() && s.charAt(j)!=' ') j++ ;

                String temp = reverse(s.substring(i,j).toCharArray()) ;
                sb.append(temp) ;
                if(j != s.length())
                sb.append(' ') ;
                 i=j+1 ;
                 j = i ;
                
            }
         return sb.toString() ;
    }

    public String reverse(char []s){
        int i = 0 , j = s.length - 1;

        while(i<j){
            char c = s[i] ;
            s[i] =s[j]  ; 
            s[j] = c ;

            i++ ; j-- ;
        }

        return  new String( s ) ;
    }

}
