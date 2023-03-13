class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
       long total_stick = 0 , total_peri = 0  ;
       long min_len = Integer.MAX_VALUE ;
       for(int i = 0 ;i<N;i++){
           if(B[i]%2 == 1)
           B[i]-- ;
           if(B[i]>=2)
           min_len = Math.min(min_len,A[i]) ;
           
           total_stick += B[i] ;
           total_peri += A[i]*B[i] ;
       }
       
       if(total_stick %4 != 0 )
       total_peri -= 2*min_len ;
       
       return total_peri ;
    }
} 
