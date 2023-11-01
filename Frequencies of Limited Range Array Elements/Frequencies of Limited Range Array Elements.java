
class Solution{
    public static void frequencyCount(int arr[], int N, int P)
    {
       int i ;
       
       
       for( i = 0 ;i<N;i++)
       if(arr[i]>N)
       arr[i] = 0 ;
       
       i = 0 ;
       while(i<N){
           if(arr[i]<=0)
           {
               i++ ; continue ;
           }
           int ind  = arr[i] -1 ;
           
           if(  arr[ind]<=0)
           {
               arr[ind]-- ;
               arr[i]= 0 ;
               i++ ;
           }
           else
           {
               arr[i] = arr[ind] ;
               arr[ind] = -1 ;
           }
       }
       
       for( i = 0 ;i<N;i++) arr[i] *= -1;
    }
}
