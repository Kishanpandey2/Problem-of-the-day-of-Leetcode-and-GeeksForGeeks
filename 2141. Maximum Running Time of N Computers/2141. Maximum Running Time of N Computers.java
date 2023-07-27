class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0 ;
        for(int l: batteries)
        sum +=  l ;

        long l = 0 , r = sum ,ans = 0 ;
        

        while(l<=r)
        {
            long avgTime = l+ (r-l)/2 ;
            if(isPossible(batteries,avgTime,n))
            {
                ans = avgTime ;
                l = avgTime+1;

            }
            else
            r = avgTime-1;
        }

        return ans;
    }

    private boolean isPossible(int []batteries ,long avgTime,int n )
    {
        long duration = 0 ;
        for(int  l: batteries)
        {
            if(l<=avgTime)
            duration += l ;
            else
            duration += avgTime ;
        }

        return duration >= avgTime*n;
    }
}
