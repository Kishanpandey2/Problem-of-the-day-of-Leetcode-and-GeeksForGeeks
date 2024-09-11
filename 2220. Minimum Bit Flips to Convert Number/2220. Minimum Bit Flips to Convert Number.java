class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0 ;

        while(start>0 && goal>0)
        {
            if((start & 1) != (goal & 1))
            {
                ans++;
            }
            start >>= 1 ;
            goal >>= 1 ;
        }

        while(start > 0)
        {
            if((start & 1 )== 1)
            ans++ ;
            start >>= 1 ;
        }
          while(goal > 0)
        {
             if((goal & 1 )== 1)
            ans++ ;
            goal >>= 1 ;
        }

        return ans;
    }
}
