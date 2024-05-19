

class Solution {
    public static int findClosest(int n, int k, int[] arr) {
       int low = 0 , high = n - 1 ;
       int ans = -1 ;
       int dif = Integer.MAX_VALUE ;
       
       while(low<=high){
           int mid = (low+high)/2 ;
           int val = arr[mid] ;
           if(val == k)
           return k ;
           
           if(Math.abs(k -val) == dif && val > ans)
               {
                   ans = val ;
                    
               }
           else if(Math.abs(k - val) < dif)
           {
               
               ans = val ;
               dif = Math.abs(k - val) ;
           }
           
           if(val <k)
           low = mid+1 ;
           else
           high = mid -1 ;
       }
       
       return ans;
    }
}
        
