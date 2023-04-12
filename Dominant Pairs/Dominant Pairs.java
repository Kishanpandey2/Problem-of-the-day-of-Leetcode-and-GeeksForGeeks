// Brute Force solution 
class Solution {
    public static int dominantPairs(int n, int[] arr) {
       int ans = 0  ;
       for(int i = 0 ;i<n/2 ;i++){
           for(int  j = n/2 ;j<n;j++){
               if(arr[i]>= 5*arr[j])
               ans++ ;
           }
       }
       return ans ;
    }
}

// Efficient Solution 

class Solution {
    public static int dominantPairs(int n, int[] arr) {
         Arrays.sort(arr,0,n/2) ;
         Arrays.sort(arr,n/2,n) ;
         
         int res = 0  ;
         int j = n/2 ;
         
         for(int i = 0 ;i<n/2;i++){
             while(j<n && arr[i]>=arr[j]*5)
             j++ ;
             
             res += j-n/2 ;
         }
         return res ;
    }
}
