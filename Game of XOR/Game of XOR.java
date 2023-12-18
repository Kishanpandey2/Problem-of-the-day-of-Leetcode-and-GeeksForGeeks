
class Solution {
    static int gameOfXor(int N , int[] A) {
       int xor = 0 ;
       
       if(N%2==0)return 0 ;
       
       for(int i =0 ;i<N;i++)
       {
           if(i%2==0)
           xor^=A[i] ;
       }
       
       return xor ;
    }
};
