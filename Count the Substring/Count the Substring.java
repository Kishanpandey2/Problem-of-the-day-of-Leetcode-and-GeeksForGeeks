class Solution {
    long countSubstring(String S){
       int len = S.length() ;
    long res = 0L ;
    int count = len ;
    long []dp = new long[2*len+1] ;
    int minus = 0 ;
    for(int i =0 ;i<len;i++)
    {
        if(S.charAt(i)=='0')
        count--;
        else
        count++;
        if(count <=len)
        minus++;
        dp[count]++ ;
    }
    int index = len ;
    for(int i = 0 ;i<len;i++)
    {
        res+=(len-i-minus)*1L ;
        if(S.charAt(i)=='1')
        {
            index++;
            
            dp[index]-- ;
            minus+=dp[index] ;
        }
        else
        {
            minus-- ;
            minus -= dp[index] ;
            index-- ;
            dp[index]-- ;
            
        }
    }
    return res ;
    }
}

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)
