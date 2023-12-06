class Solution {
    public int totalMoney(int n) {
        if(n<=7)
        {
            int sum = 0 ;
            for(int i = 1;i<=n;i++)sum+=i ;
            return sum ;
        }

        int len = n%7==0 ? n/7 : n/7 + 1 ;

        int ans = 0;
        for(int i  = 1;i<=len;i++)
        {
            for(int j = 0;j<7;j++)
           { ans+=(i+j) ;
            n-- ;
            if(n==0)break;
           }
        }

        return ans;
    }
}
