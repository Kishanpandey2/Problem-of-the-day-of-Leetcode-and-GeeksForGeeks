class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // first sort the costs in assending order 
        Arrays.sort(costs) ;
        int ans = 0  ;
        for(int i: costs)
        {
            if(coins>=i)
            {
                ans++  ;
                coins-=i ;
            }
        }
        return ans ;
    }
}
