class Solution {
    void convert(int[] arr, int n) {
      
        Map<Integer,Integer>map = new HashMap<>() ;
        int []ans = new int[n] ;
        for(int i =0;i<n;i++)
        ans[i]=arr[i] ;
        Arrays.sort(ans) ;
        for(int i = 0 ;i<n;i++)
        {
         map.put(ans[i],i) ;
        }
           
        for(int i =0 ;i<n;i++)
        {
            arr[i]= map.get(arr[i]) ;
        }
        
    }
}


Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)
