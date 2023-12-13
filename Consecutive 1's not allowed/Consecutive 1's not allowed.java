
class Solution {
    long countStrings(int n) {
        long mod = 1000000007 ;
        long zeroend = 1 ;
        long oneend = 1 ;
        long ans = zeroend+oneend ;
        
        if(n == 1)return ans ;
        int i = 2 ;
        while(i<= n){
            oneend = zeroend ;
            zeroend = ans ;
            ans = (oneend+zeroend) %mod ;
            i++;
        }
        
        return ans ;
    }
}
