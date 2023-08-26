class Solution {
    public int findLongestChain(int[][] pairs) {
        int current = Integer.MIN_VALUE ;
        int ans = 0 ;
        Arrays.sort(pairs, (a,b)->{
            return a[1]-b[1] ;
        });

        for(int []pair: pairs)
        {
            if(current<pair[0])
            {
                current = pair[1];
                ans++;
            }
        }
        return ans;
    }
}
