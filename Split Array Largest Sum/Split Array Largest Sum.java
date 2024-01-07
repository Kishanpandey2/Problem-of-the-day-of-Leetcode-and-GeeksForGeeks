
class Solution {
      static int splitArray(int[] arr , int N, int K) {
       
        int mx = 0 ;
        int sm = 0 ;
        for(int x:arr)
        {
            sm+=x ;
            mx = Math.max(mx,x) ;
        }
        if(K==arr.length)
        return mx ;
        int low = mx ;
        int high = sm ;
        int res  = 0 ;
        while(low<=high)
        {
            int mid = low+(high - low )/2 ;
            if((ispos(arr,mid,K))==true )
            {
                res = mid ;
                high = mid-1 ;
            }
            else
            low=mid+1 ;
            
            
        }
        return res ;
    }
    public static boolean  ispos(int []ar , int mid , int k )
    {
        
        int sub_a = 1 ;
        int sum =  0 ;
        for(int i = 0 ;i<ar.length;i++)
        {
            sum+=ar[i] ;
            if(sum>mid)
            {
                sub_a++;
                sum = ar[i] ;
            }
        }
        return sub_a<=k ;
    }
};
