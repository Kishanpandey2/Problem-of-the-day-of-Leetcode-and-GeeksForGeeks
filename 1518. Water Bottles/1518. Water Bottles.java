class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles ;

        int emptyBot = numBottles ;

        while(emptyBot>=numExchange){
            ans += emptyBot/numExchange; 
            int r = emptyBot%numExchange ;

            emptyBot = emptyBot/numExchange + r ;
        }  
        return ans;
    }
}
