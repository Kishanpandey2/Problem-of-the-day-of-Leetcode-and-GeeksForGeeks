
class Solution{
    static boolean findsum(int arr[],int n)
    {
         Set<Integer>st = new HashSet<>() ;
         
         int sum = 0 ;
         for(int i  = 0 ;i<n;i++){
              sum += arr[i] ;
              
              if(sum == 0 || arr[i]== 0)return true ;
              
              if(st.contains(sum))return true ;
              
              st.add(sum) ;
         }
         
         return false;
    }
}
