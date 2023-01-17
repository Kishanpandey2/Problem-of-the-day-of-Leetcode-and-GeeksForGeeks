class Solution {
    public int minFlipsMonoIncr(String s) {
        int zeroToOne = 0  ;
        int oneToZero = 0 ;
        int i = 0 ;
        while(i<s.length() && s.charAt(i)=='0')
        {
            i++;
        }
        for(;i<s.length() ;i++)
        {
            char ch =s.charAt(i) ;
            if(ch=='0')
            zeroToOne++ ;
            else
            oneToZero++ ;
            if(zeroToOne>oneToZero)
            zeroToOne = oneToZero ;
        }
        return zeroToOne ;
    }
}
