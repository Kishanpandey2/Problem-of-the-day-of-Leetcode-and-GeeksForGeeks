class Solution {
    public static int minimumNumber(int n, int[] arr) {
       int ans =0 ;
       for(int i = 0 ;i<n;i++)
       ans = gcd(ans,arr[i]);
       
       return ans ;
    }
    public static int gcd(int a,int b){
        if(b==0)
        return a ;
        return gcd(b,a%b) ;
    }
}
