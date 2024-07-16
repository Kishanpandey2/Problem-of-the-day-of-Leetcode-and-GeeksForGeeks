
class Solution {
    public String printString(String s, char ch, int count) {
        StringBuilder sb = new StringBuilder() ;
        int cnt = 1 ;
        for(int  i = 0 ;i<s.length();i++)
        {
            if(cnt<=count)
            {
                if(s.charAt(i)==ch)
                cnt++;
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.length()==0?"":sb.toString();
    }
}
