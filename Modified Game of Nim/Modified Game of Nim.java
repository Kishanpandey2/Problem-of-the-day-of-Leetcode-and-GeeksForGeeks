
class Solution{
    static int findWinner(int n, int A[]){
         int xor = 0  ;
         
         for(int i: A)
         xor^= i ;
         
         if(xor == 0)return 1 ;
         
        return (n%2==0)?1:2 ;
         
          
    }
}
