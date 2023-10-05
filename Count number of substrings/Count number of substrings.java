
class Solution
{
    long substrCount (String S, int K) {
       Set<Character>st ;
       int n = S.length() ;
       int ans = 0 ;
       
       for(int i = 0 ;i<n ;i++){
           st = new HashSet<>() ;
           int distinctChar = 0 ;
           
           for(int j = i;j<n;j++){
               char ch = S.charAt(j) ;
               if(!st.contains(ch))
               {
                   st.add(ch) ; distinctChar++ ;
               }
               
               if(distinctChar == K)
               ans++ ;
               if(distinctChar > K)
               break ;
           }
       }
       
       return ans;
    }
}
