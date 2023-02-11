class Solution {
    public static int getMinimumDays(int N, String S, int[] p) {
        char a[] = S.toCharArray() ;
        int total_v = 0 ;
        for(int i =0 ;i<N-1 ;i++){
            if(a[i]==a[i+1])
            total_v++ ;
        }
        if(total_v==0)
        return 0 ;
        
        for(int i = 0 ;i<N;i++){
            if(p[i]-1>=0 && p[i]-1<N && a[p[i]]==a[p[i]-1])
            total_v-- ;
            if(p[i]+1>=0 && p[i]+1<N && a[p[i]]==a[p[i]+1])
            total_v-- ;
            a[p[i]]='?' ;
            if(total_v==0)
            return i+1 ;
        }
        return 0 ;
    }
}
        
