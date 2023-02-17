class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        long sum = 0 ;
        for(int i = K;i<N;i++){
            sum = 0 ;
            for(int j = i-K;j<i;j++){
                sum+=GeekNum.get(j) ;
            }
            GeekNum.add(sum) ;
        }
        return GeekNum.get(N-1) ;
    }
}
