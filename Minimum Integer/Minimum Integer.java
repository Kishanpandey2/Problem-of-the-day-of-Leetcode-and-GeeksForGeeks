class Solution {
    public static int minimumInteger(int N, int[] A) {
        if(N==1)
        return A[0] ;
        long sum  = 0  ;
        for(int  i: A)
        sum += i ;
        long ans = Integer.MAX_VALUE ;
        for(int i :A){
            if( Math.log(sum) <= Math.log( N )+Math.log( i ))
            ans  = Math.min(ans,i) ;
        }
        return (int)ans;
    }
}
        
