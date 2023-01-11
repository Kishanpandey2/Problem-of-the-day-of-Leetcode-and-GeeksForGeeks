
class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        long res = 0 ;
        Arrays.sort(arr);
        for(int i = 1 ;i<arr.length;i++)
        {
         if(arr[i]<=arr[i-1])
         {
             int difference = arr[i-1]-arr[i] ;
             res+=difference+1 ;
             arr[i]=arr[i-1]+1 ;
         }
        }
        return res;
    }
}
