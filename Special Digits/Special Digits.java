class Solution {
    static long mod = 1000000007;
    static boolean hogya=false;
    static long factorial[] = new long[100001];
    static long mm[] = new long[100001];
    static void help(){
        factorial[0]=1;
        for(int i=1;i<=100000;i++){
            factorial[i] = (i*factorial[i-1])%mod;
        }
        mm[100000] = power(factorial[100000],mod-2);
        for(int i=99999;i>=0;i--){
            mm[i] = (mm[i+1]*(i+1))%mod;
        }
    }
    static long power(long x,long y)
    {
        long res = 1;
        x = x % mod;
        while (y > 0)
        {
            if ((y & 1)==1)
                res = (res * x) % mod;
     
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }
    static long help2(int n,int r){
     
        return (factorial[n] * mm[r] % mod
                * mm[n - r] % mod)
               % mod;
    }
    public static int bestNumbers(int N, int A, int B, int C, int D) {
        // code here
        boolean hai=false;
        int i=0,sum;
        if(A==B){
            sum = N*A;
            while(sum!=0){
                int digit = sum%10;
                if(digit==C || digit==D){
                    hai=true;
                    break;
                }
                sum/=10;
            }
            if(hai)return 1;
            return 0;
        }
        if(hogya==false){
            help();
            hogya=true;
        }
        long ans = 0;
        while(i<=N){
            sum = A*i+(B*(N-i));
            hai=false;
            while(sum!=0){
                int digit = sum%10;
                if(digit==C || digit==D){
                    hai=true;
                    break;
                }
                sum/=10;
            }
            if(hai==true){
                ans+=help2(N,i);
                ans%=mod;
            }
            i++;
        }
        return (int)ans;
    }
    
    
}
