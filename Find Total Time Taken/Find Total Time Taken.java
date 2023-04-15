class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
     Set<Integer>st  = new HashSet<>() ;
    int      ans = 0;
     for(int i = 0 ;i<n ;i++){
         if(  st.contains(arr[i]))
         ans+= time[arr[i]-1] ;
         else{
             st.add(arr[i]);
         ans++;
         }
     }
     return ans-1 ;
    }
}
