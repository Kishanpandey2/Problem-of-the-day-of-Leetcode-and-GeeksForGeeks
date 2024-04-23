class Solution {
    static int firstElement(int n) {
          if(n<=2)
        return 1;
        
        if(n==3)
        return 2;
        
        int a=1,b=2,c=0;
        int mod=1000000007;
        while(n>=4){
            
            c=(a+b)%mod;
            a=b;
            b=c%mod;
            n--;
        }
        
        return c%mod;
   
    }
}
