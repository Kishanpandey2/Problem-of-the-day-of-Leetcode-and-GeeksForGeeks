
class Solution {
    static Long reversedBits(Long x) {
         int ind = 31 ;
         long ans = 0 ;
         
         while(x >0){
             if((x & 1 ) != 0)
             ans += (long) (Math.pow(2,ind)) ;
             
             x >>= 1 ;
             ind--;
             
         }
         
         return ans;
    }
};
