
class Solution {
    static long genFibNum(Long a, Long b, Long c, long n, long m) {
           if (n <= 2) {
            return 1 % m;
        }
        long[][] mat = {
                {a, b, 1},
                {1, 0, 0},
                {0, 0, 1}
        };
        long[][] res = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        n -= 2;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = multiply(res, mat, m);
            }
            mat = multiply(mat, mat, m);
            n >>= 1;
        }
        return (res[0][0] + res[0][1] + c * res[0][2]) % m;
    }
    static long[][] multiply(long[][] A, long[][] B, long m) {
        int size = A.length;
        long[][] result = new long[size][size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                long sum = 0;
                for (int k = 0; k < size; ++k) {
                    sum += A[i][k] * B[k][j];
                    sum %= m;
                }
                result[i][j] = sum;
            }
        }
        return result;
    
    }
};
