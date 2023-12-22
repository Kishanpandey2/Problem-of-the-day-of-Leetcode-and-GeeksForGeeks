class Solution {
    public int maxScore(String s) {
        int ans = 0 ;

        int rightZero = 0 , rightOne = 0 ;

        for(char ch : s.toCharArray())
        if(ch == '0')
        rightZero++ ;
        else
        rightOne++ ;

        int leftZero = (s.charAt(0)=='0')?1:0 , leftOne = (s.charAt(0) == '0')?0:1 ;
        rightZero -= leftZero ;
        rightOne -= leftOne ;

        ans = Math.max(ans,leftZero+rightOne ) ;
        for(int i = 1;i<s.length()-1 ;i++){
            if(s.charAt(i)=='0')
           { leftZero++ ;
           rightZero-- ;
           }
            else
           { leftOne++ ;
           rightOne--;
           }

            ans = Math.max(ans,leftZero+rightOne ) ;
        }

        return ans;
    }
}
