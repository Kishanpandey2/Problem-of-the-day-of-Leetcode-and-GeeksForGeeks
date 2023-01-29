
class Solution {
    public static int solve(int a, int b) {
        if(a==b)
        return 0 ;
        if((a&b)==Math.min(a,b))
        return 1;
        
        if((a&b)>=0 && (a&b)<Math.min(a,b))
        return 2;
        return 0;
    }
}
      
