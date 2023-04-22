class Solution
{
   public long[] smallerSum(int n,int arr[])
    {
        long ans[]=new long[n];
        
        long asc[]=new long[n];
        for(int i=0; i<n; i++){
            asc[i] = arr[i];
        }
        Arrays.sort(asc);
        
        long p_sum[]=new long[n];
        p_sum[0]=asc[0];
        for(int i=1; i<n; i++){
            p_sum[i] = asc[i] + p_sum[i-1];
        }
        
        for(int i=0; i<n; i++)
        {
            if(asc[0]==arr[i])
            {
                ans[i]=0;
                continue;
            }
          
            int l=0,r=n-1;
            while(l<r){
                int mid=(l+r+1)/2;
                if(asc[mid]>=arr[i])
                    r=mid-1;
                else
                    l=mid;
            }
             ans[i]=p_sum[l];
        }
        return ans;
    }
}
