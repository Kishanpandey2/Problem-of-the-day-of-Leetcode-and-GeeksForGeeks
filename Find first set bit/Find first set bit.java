 

class Solution
{
     
    public static int getFirstSetBit(int n){
            
         int cnt = 0 ;
         
         while(n>0){
             cnt++;
             if((n&1)==1){
                 return cnt ;
             }
             n>>=1 ;
         }
         return 0 ;
            
    }
}
