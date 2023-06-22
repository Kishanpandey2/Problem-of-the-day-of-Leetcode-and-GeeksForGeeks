class Solution {
    public int maxProfit(int[] prices, int fee) {
        int effectiveBuyPrice = prices[0];
        int profit = 0 ;
        for(int i = 0 ;i<prices.length;i++)
        {
            profit = Math.max(profit, prices[i]-effectiveBuyPrice-fee);
            effectiveBuyPrice = Math.min(effectiveBuyPrice,prices[i] - profit);
        }
        return profit ;
    }
}
