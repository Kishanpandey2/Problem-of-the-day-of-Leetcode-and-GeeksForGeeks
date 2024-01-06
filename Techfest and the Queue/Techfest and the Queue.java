
class Solution {
    public static long primeFacotor(long n){
        if(n ==1)return 0 ;
        long cnt = 0 ;
        while(n%2==0)
        {
            cnt++;
            n/=2 ;
        }
        
        for(int i= 3;i<=Math.sqrt(n);i+=2)
        {
                while(n%i==0)
                {
                    cnt++;
                    n/=i ;
                }
            
        }
        
        if(n>2)cnt++;
        
        return cnt ;
    }
    public static long sumOfPowers(long a, long b) {
        long sum = 0 ;
        
        while(a<=b)
        {
            sum = sum+primeFacotor(a) ;
            a++;
        }
        
        return sum ;
    }
}
        
