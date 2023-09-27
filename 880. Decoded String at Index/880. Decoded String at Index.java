class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0 ;
        int n = s.length() ;

        for( char ch : s.toCharArray()){
            if(Character.isDigit(ch))
            size = size * ( ch - '0') ;
            else
            size++ ;
        }

        for(int i = n - 1;i>=0 ;i--){
            k %= size ;
            char ch = s.charAt(i) ;
            if((k == 0 || k == size) && Character.isLetter(ch))
            return Character.toString(ch) ;

            if(Character.isDigit(ch))
            size = size / (ch-'0') ;
            else
            size-- ;
        }

        return null ;
    }
}
