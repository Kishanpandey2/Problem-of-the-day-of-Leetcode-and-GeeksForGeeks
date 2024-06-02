class Solution {
    public void reverseString(char[] s) {
        int l = 0 , h = s.length-1 ;

        while(l<h)
        {
            char ch = s[l] ;
        s[l] = s[h] ;
        s[h] = ch ;

        l++;  h--;
        }
    }
    
}
