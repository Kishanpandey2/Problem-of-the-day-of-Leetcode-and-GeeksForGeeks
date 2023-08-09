// Brute Force solution 

class Solution{
   private static boolean isPrime(int n)
    {
        if(n==2 || n==3)return true ;
        
        if(n%2==0 || n%3==0)
        return false;
        
        for(int i = 5;i*i<=n;i+=6)
        {
            if(n%i==0 || n%(i+2)==0)
            return false;
        }
        return true;
    }
    static long largestPrimeFactor(int N) {
      
        long ans = 0 ;
        for(int i = 2;i<=N;i++)
        {
            if(N%i==0 && isPrime(i))
            ans = i;
        }
        return (ans!=0)?ans:N;
    }
}

// Efficient solution

class Solution{
    static long largestPrimeFactor(int N) {
        long i = 2;
       while((i*i)<=N)
        {
           if(N%i==0)
           N/=i;
           else
           i++;
        }
        return N;
    }
}
