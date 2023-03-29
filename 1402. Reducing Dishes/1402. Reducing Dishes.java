class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int pansum = 0, ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            pansum += satisfaction[i];
            if (pansum < 0) {
                break;
            }
            ans += pansum;
        }
        return ans;
    }
}
