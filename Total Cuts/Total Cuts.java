
class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        int[] maxL = new int[N];
        int[] minR = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < N; i++) {
            max = Math.max(max, A[i]);
            maxL[i] = max;
        }

        for (int i = N - 1; i >= 0; i--) {
            min = Math.min(min, A[i]);
            minR[i] = min;
        }

        for (int i = 0; i < N - 1; i++) {
            if ((maxL[i] + minR[i + 1]) >= K) {
                count++;
            }
        }

        return count;
    }
}
        

