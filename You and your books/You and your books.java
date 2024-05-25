

class Solution {
    long max_Books(int arr[], int n, int k) {
        long mx = 0;
        
        long sum  = 0 ;
        
        for(int i = 0 ;i<n;i++)
        {
            if(arr[i]<=k)
            sum += arr[i ] ;
            else
            {
                mx = Math.max(sum,mx) ;
                sum = 0 ;
            }
        }
        mx = Math.max(mx,sum);
        return mx;
    }
}
