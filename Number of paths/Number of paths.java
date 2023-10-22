
class Solution{
    
    long numberOfPaths(int m, int n) {
        long ans = 1;
        long mod = 1000000007L; // Use 'L' to indicate a long literal
        for (long i = n; i <= (n + m - 2); i++) {
            ans = (ans * i) % mod;
            long invert = modInv(i - n + 1, mod);
            ans = (ans * invert) % mod;
        }
        return ans;
    }
    
    long pow(long x, int y, long mod) {
        long res = 1;
        while (y > 0) {
            if (y % 2 != 0)
                res = (res * x) % mod;

            y = y / 2;
            x = (x * x) % mod;
        }
        return res;
    }

   long modInv(long n, long mod) { 
        return pow(n, (int) (mod - 2), mod); 
    }
    
}
