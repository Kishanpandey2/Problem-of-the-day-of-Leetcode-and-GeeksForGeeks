class Solution {
   static  int mod = 1000000007 ;
    static int nthFibonacci(int n){
        if(n==1 || n==2)
        return 1 ;
        int a = 1, b = 1 ;
        int c = 0;
        for(int i = 3;i<=n;i++)
        {
         c = (a%mod+b%mod)%mod ;
         a = b%mod ;
         b = c;
         
        }
        return c;
    }
}
