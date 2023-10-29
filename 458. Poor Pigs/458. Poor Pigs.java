class Solution {
    public int poorPigs(int buckets, int timeToDie, int timeToTest) {
        int testsPerPig = timeToTest / timeToDie;
        int numPigs = 0;
        int states = 1;    
        while (states < buckets) {
            states *= (testsPerPig + 1);
            numPigs++;
        }
        return numPigs;
    }
}
