
class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum =  0 ;
        for(int i : arr)sum += i ;
        if(isPrime(sum))return 0;
        
        for(int i = sum + 1;i<=sum *2;i++)
        if(isPrime(i)) 
        return i - sum ;
        
        return 0 ;
     }
    public boolean isPrime(int x){
        if(x == 1)return false ;
        if(x == 2)return true ;
        for(int i = 2;i<= Math.sqrt(x);i++)
        if(x%i ==0)return false ;
        
        return true;
    }
}
