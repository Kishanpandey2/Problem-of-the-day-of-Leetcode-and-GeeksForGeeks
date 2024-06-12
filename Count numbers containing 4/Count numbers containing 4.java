
class Solution {
    public static int countNumberswith4(int n) {
        int ans = 0 ;
        
        for(int i = 1;i<=n;i++)
        if(digitFour(i))
        ans++;
        
        return ans;
    }
    static boolean  digitFour(int n){
        while(n> 0)
        {
            int d = n%10 ;
            if(d == 4)
            { return true ;
           
            }
            n /= 10 ;
        }
        
        return false;
    }
}
