class Solution {
    public int numberOfWays(String corridor) {
        int cntSeat =0 ;
        for(char ch : corridor.toCharArray())
        if(ch == 'S')cntSeat++ ;

            if(cntSeat == 0 || cntSeat%2!=0)return 0 ;
        int curSeat = 0 ;
       long ans = 1 ;
        for(int i = 0 ;i<corridor.length() ;i++)
        {
            if(corridor.charAt(i) == 'S')
            curSeat++ ;

            if(curSeat == 2)
            {
                int c = 1 ;
                i++ ;
                while(i<corridor.length() && corridor.charAt(i)=='P')
                {
                    i++ ; c++;
                }
                if(i == corridor.length())break;

                curSeat = 0 ;
                ans = (ans*c)%1000000007 ;
                i--;
            }
        }
        return (int)ans;
    }
}
