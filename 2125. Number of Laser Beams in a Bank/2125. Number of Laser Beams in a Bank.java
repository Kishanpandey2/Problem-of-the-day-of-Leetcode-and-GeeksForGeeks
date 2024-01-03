class Solution {
    public int numberOfBeams(String[] bank) {
        int r1Ones = 0 ;
        int r2Ones = 0 ;
        
        int i = 1 , n = bank.length ;

        if(n == 1)return 0 ;

        for(char ch : bank[0].toCharArray())
        if(ch == '1')r1Ones++;

        int res = 0 ;
        while(i<n){
            for(char ch : bank[i].toCharArray())
        if(ch == '1')r2Ones++;

        if(r1Ones > 0 && r2Ones >  0)
        {
                res += (r1Ones* r2Ones);
                r1Ones = r2Ones ;
                r2Ones =  0;
                i++;
        }
        else if(r1Ones == 0 )
        {
            r1Ones = r2Ones ;
            r2Ones =  0;
            i++;
        }
        else if(r2Ones == 0)
        {
            i++;
        }

        }

        return res;

        
    }
}
