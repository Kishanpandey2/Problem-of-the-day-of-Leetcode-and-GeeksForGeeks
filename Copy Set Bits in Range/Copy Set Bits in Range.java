 class Solution{
    static int setSetBit(int x, int y, int l, int r){
        
        int ans = 1 ;
        ans <<= (r-l+1) ;
        ans--;
        ans <<= (l-1);
        ans = ans & y ;
        x = x|ans ;
        
        return x ;
    }
}
