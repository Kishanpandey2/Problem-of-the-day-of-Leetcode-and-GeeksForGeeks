class Solution {
    int findMaxSum(int arr[], int n) {
       int inc = arr[0] ;
       int exc = 0 ;
       for(int i = 1;i<n;i++){
           int ninc = exc+arr[i] ;
           int nexc = Math.max(inc,exc) ;
           inc = ninc ;
           exc = nexc ;
       }
       int ans = Math.max(inc,exc) ;
       return ans ;
    }
}
