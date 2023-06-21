
class Solution {
    static int sumOfNaturals(int n) {
       long ans =(long)n*(n+1)/2;
         long mod=1000000007;
          ans=ans%mod;
         return (int)ans;
    }
};
