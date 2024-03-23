
class Solution {

    int[] Series(int n) {
       int ans[] = new int[n+1] ;
       int mod = (int)(1e9+7) ;
       int a = 0 , b = 1 ;
       
       for(int i = 0 ;i<n+1;i++){
           ans[i] = a;
           int c = (a%mod+b%mod)%mod ;
           a = b ;
           b  = c ;
       }
       
       return ans;
    }
}
