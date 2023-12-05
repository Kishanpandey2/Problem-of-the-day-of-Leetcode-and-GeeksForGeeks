
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
      if(n == 1)return 0 ;
      
      int min ,max  ;
      
      Arrays.sort(arr) ;
      int dif = arr[n-1]-arr[0] ;
      
      for(int i = 1;i<n;i++)
      {
          if(arr[i]-k<0)continue ;
          
          max = Math.max(arr[i-1]+k,arr[n-1]-k) ;
          min = Math.min(arr[i]-k,arr[0]+k) ;
          
          dif= Math.min(max-min,dif) ;
      }
      
      return dif ;
    }
}
