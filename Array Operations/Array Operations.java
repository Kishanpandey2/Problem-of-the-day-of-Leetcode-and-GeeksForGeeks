
class Solution {
    public static int arrayOperations(int n, int[] arr) {
         int res = 0;
        int cnt = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)cnt++;
            if (arr[i] == 0) {
                zero= 1;
                if (cnt > 0)res++;
                cnt = 0;
            }
        }
        if (cnt > 0)res++;
        if (zero == 0)return -1;
        return res;
    }
}
        
