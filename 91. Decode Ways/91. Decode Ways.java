class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0 || s.charAt(0) == '0') return 0 ;

        if(s.length() == 1)return 1 ;

        int cnt1 = 1, cnt2 = 1 ;

        for(int i = 1;i<s.length() ;i++){
            int d = s.charAt(i) - '0' ;

            int dd = (s.charAt(i-1)-'0')*10 + d ;

            int cnt = 0 ;
            if( d >0 )
            cnt+=cnt2 ;

            if(dd>=10 && dd<=26)
            cnt += cnt1 ;

            cnt1 = cnt2 ;
            cnt2 = cnt ;
        }

        return cnt2 ;
    }
}
