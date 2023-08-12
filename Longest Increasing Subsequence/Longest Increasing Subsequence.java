

class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[])
    {
        // code here
        int ans[] = new int[n]; int len=1;
        ans[0] = arr[0];
        
        for(int i = 1 ;i <n ;i++)
        {
            if(arr[i] > ans[len-1] )
            {
                ans[len] = arr[i]; len++;
            }
            else // arr[i] < ans[len-1];
            {
                int c = ceilIndex(ans, 0 , len-1, arr[i]);
                ans[c] = arr[i];
            }
        }
        return len;
    }
    
    static int ceilIndex( int ans[] , int l , int r, int x)
    {
        while(l<r)
        {
            int m = (l+r)/2;
            if(ans[m] >= x)
            {
                r =m;
            }
            else
            l = m+1;
        }
        return r;
    }
} 
