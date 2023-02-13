class Solution{
    static int inSequence(int A, int B, int C){
       if(A==B)
       return 1 ;
       else if( ((A>B) && C<0) || ((A<B)&& C>0))
       {
           int dif = B- A ;
           if(dif%C==0)
           return 1 ;
           else
           return 0 ;
       }
       else
       return 0 ;
    }
}
