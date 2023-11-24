class Solution {
    public int maxCoins(int[] piles) {
        int ans = 0 ;

        Arrays.sort(piles) ;

        int i = 0 , j = piles.length-1,k = piles.length - 2;

        
        while(i<k)
        {
                ans+= piles[k] ;
                i++ ; k -= 2 ; j -=2 ;

        }

        return ans;
    }
}
