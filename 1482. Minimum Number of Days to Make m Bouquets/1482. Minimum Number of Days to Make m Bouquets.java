class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)return -1;
        int low = Integer.MAX_VALUE, high =0; 

        for(int day :bloomDay)
        {
            low  = Math.min(low,day);
            high = Math.max(high,day);
        }
        
        int ans = high;
        boolean flag= false;
        while(low<=high)
        {
            int mid = low+ (high -low)/2 ;

            if(possible(bloomDay,mid,m,k))
            {
                ans = Math.min(ans,mid);
                high = mid-1;
                flag = true;
            }
            else
            low = mid+1;
        }

            if(!flag)return -1;

        return ans ;

    }
    boolean possible(int []bloomDay,int day,int m,int k)
    {
        int cnt = 0 ;
        int ans = 0 ;
        for(int bl : bloomDay)
        {
            if(bl<=day)
            cnt++;
            else
            {
                ans += (cnt/k);
                cnt = 0 ;
            }
        }
        ans += (cnt/k);

        return ans >= m;
    }

}
