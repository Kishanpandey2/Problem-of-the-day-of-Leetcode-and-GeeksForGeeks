class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0 ;

        for(String str : details)
        {
            if((str.charAt(11)-'0' ) > 6)cnt++;
            else
            if((str.charAt(11)-'0' ) >= 6 && (str.charAt(12)-'0' )>0)cnt++;
        }

        return cnt;
    }
}
