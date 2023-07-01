class Solution {
    static int setBits(int N) {
        int cnt = 0 ;
        if(N==1 ||N==2)
        return 1; 
        
        while(N>0)
        {
            cnt++ ;
            N = (N)&(N-1) ;
        }
        return cnt;
    }
}
