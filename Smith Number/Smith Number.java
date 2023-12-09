
class Solution {
     
    static int smithNum(int n) {
        int sum = digitSum(n) ;
        int temp = 0 ;
        
        if(isPrime(n))return 0 ;
        
       for(int i = 2;i<=Math.sqrt(n);i++)
        {
            if(n%i ==0 ){
                int s = digitSum(i) ;
            while(n%i == 0)
            {
                temp += s ;
                n/=i ;
            }
            }
        }
        if(n>1)
        temp += n ;
        return sum == temp ?1:0;
        
        
        
    } 
     static boolean isPrime(int n){
        if(n == 1)return false ;
        if( n == 2) return true ;
        
        for(int i = 2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false ;
        }
        
        return true ;
    } 
    static int digitSum(int n){
        int sum = 0 ;
        
        while(n>0)
        {
            sum +=(n%10) ;
            n/=10 ;
        }
        return sum ;
    }
};
