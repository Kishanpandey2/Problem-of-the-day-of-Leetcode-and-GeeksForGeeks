class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices) ;

        for(int i = 1 ;i< prices.length ;i++)
        {
            if((prices[i]+prices[i-1])<=money)
            {
                money -= (prices[i]+prices[i-1]) ;
                 return money ;
            }

        }
        return money ;
    }
}
