
class Solution {


    public static int equilibriumPoint(long arr[], int n) {
        
        if( n == 1)return 1 ;
         long sum = 0 ;
         for(long i : arr) sum += i  ;
         
         long tempSum = arr[0] ;
         for(int i = 1 ;i<n;i++){
             
             if( (sum - arr[i] - tempSum) == tempSum) 
             return i+1 ;
             tempSum += arr[i] ;
         }
         
         
         return -1 ;
    }
}
