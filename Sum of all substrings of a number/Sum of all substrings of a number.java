
class Solution
{
     
    public static long sumSubstrings(String s)
    {
     long prev = 0 , cur = 0 , ans = 0 ;
     long mod  = (long)(1e9+7);
     
     for(int i = 0 ;i<s.length();i++)
     {
         cur= (((s.charAt(i)-'0') * (i+1) ) + (prev*10)%mod)%mod ;
         
         prev = cur ;
         ans = (ans%mod + cur%mod)%mod ;
     }
     
     return ans;
    }
}
