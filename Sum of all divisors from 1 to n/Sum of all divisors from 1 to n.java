//Brute Force solution
class Solution{
    static long sumOfDivisors(int N){
        long sum = 0 ;
        for(int i = 1;i<=N;i++)
        {
            long tSum = divisor(i) ;
            sum+=tSum ;
            
        }
        return sum ;
    }
    static long divisor(int n){
        long sum  = 0 ;
        for(int i = 1;i*i<=n;i++){
            if(n%i == 0 )
            {
                sum += i ;
                if(i!= n/i)
                sum += n/i ;
            }
        }
        return sum ;
    }
}


// Efficient solution 
class Solution{
    static long sumOfDivisors(int N){
      long sum = 0 ;
      
      for(int i = 1;i<=N;i++)
      sum += (N/i)*i ;
      
      return sum ;
    }
}
