class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0 ;
        int curAltitude = 0 ;
        for(int i : gain){
            curAltitude += i ;
            maxAltitude = Math.max(maxAltitude , curAltitude);
        }
        return maxAltitude;
    }
}
