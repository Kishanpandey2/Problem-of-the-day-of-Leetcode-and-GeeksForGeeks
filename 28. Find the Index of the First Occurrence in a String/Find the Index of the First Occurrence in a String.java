class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(haystack))
        return 0 ;

        if(needle.length()>haystack.length())
        return -1 ;
        for(int i  = 0 , j = needle.length() ;j<=haystack.length() ;i++,j++)
        {
            if(needle.equals(haystack.substring(i,j)))
            return  i ;
        }
        return -1 ;
    }
}

