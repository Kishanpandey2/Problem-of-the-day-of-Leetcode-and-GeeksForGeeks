
class Solution {
    public static void convertToWave(int n, int[] a) {
        for(int i = 0 ;i<n-1;i++){
            if( i%2==0)
            swap(a,i,i+1) ;
        }
        
    }
   private static  void swap(int[] a,int i,int j){
        int t = a[i] ;
        a[i] = a[j] ;
        a[j] = t;
    }
}
