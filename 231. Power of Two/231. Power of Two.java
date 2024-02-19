// Method - 1
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n ==0)return false;
       int cnt = 0 ;
       while(n>0)
       {
           cnt++ ;
           n= n&(n-1) ;
       }

       return cnt == 1;
    }
}




// Method - 2
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n ==0)return false;
        if(n ==Integer.MIN_VALUE)return false;
       return (n&(-n))==n;
    }
}
