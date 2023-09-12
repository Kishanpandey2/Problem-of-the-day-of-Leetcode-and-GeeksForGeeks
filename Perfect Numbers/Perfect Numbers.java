class Solution {
    private static boolean factor(long n , long d){
        if(n%d==0)return true ;
        else
        return false;
    }
    static int isPerfectNumber(long N) {
        if(N==1)
        return 0;
        
        long sum = 1 ;
        
        for(long i = 2;i*i<=N;i++){
            if(factor(N,i))
            {sum += i ;
            sum += N/i ;
            }
        }
        
        return (sum == N) ?1:0 ;
    }
};
