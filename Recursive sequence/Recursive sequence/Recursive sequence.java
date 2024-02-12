class Solution{
    static long sequence(int n){
        long mod = (long) (1e9+7);
       long ans =  0 ;
       int cnt = 1;
       
       for(int i = 1;i<=n;i++){
           
           long temp = 1 ;
           for(int j =1;j<=i;j++)
           {
              temp = (temp%mod * cnt%mod)%mod ;
              cnt++;
           }
           ans= (ans % mod+ temp%mod)%mod;
       }
       
       return ans;
    }
}
