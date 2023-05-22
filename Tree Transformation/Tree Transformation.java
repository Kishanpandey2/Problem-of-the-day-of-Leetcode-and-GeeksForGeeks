
class Solution {
    public static int solve(int N, int[] p) {
        int[] arr = new int[N];
        Arrays.fill(arr, 0);
        
        for (int i = 1; i < N; i++) {
            arr[p[i]]++;
            arr[i]++;
        }
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        
        if (count == N) {
            return 0;
        }
        
        return N - 1 - count;
    }
} 
