// Brute force or Naive solution 
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int cnt = 0  ;
        for(int i = 0 ;i<n;i++)
        {
            long sum = 1 ;
            for(int j = i ;j<n;j++)
            {
                sum *= a[j] ;
                if(sum<k)
                cnt++;
                else
                break;
            }
        }
        return cnt ;
    }
}


// Efficient solution 
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        long p =1  ;
        int i  ,j , ans = 0 ;
        for( i = 0 , j = 0 ;j<n;j++)
        {
             p *= a[j];
           while(p>=k && i<j)
            {
                p/=a[i] ; i++;
            }
            if(p<k)
            ans += (j-i+1);
        }
        return ans ;
    }
}
