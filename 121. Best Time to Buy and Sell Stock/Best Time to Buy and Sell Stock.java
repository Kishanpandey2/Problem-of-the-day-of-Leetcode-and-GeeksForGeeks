class Solution {
    public int maxProfit(int[] prices) {
        int mx = Integer.MIN_VALUE ;
        int minSoFar = prices[0] ;
        int mxProfit = 0 ;
        for(int i =  1 ;i<prices.length ;i++){
            minSoFar = Math.min(minSoFar,prices[i]);
            mxProfit = prices[i] - minSoFar ;
            mx = Math.max(mxProfit,mx) ;
        }
        if(mx!=Integer.MIN_VALUE )
        return mx ;
        return 0 ;
    }
}
