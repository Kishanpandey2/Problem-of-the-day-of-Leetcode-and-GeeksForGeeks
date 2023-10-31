
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
       int end = n-1, mid  = 0  ;
       for(int i = 0 ;i<n;i++){
           int st = i  ;
           while(mid<=end && arr[mid]==0)mid++ ;
           
           if(mid<=end)
           swap(arr,st,mid) ;
           
           mid++;
       }
       
    }
    
    private void swap(int []a,int i,int j){
        int t = a[i] ;
        a[i] = a[j] ;
        a[j] = t ;
    }
}
