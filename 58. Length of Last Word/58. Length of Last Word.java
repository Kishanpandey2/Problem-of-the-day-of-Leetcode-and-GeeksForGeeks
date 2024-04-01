class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim() ;

        int cnt = 0 ;

        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!= ' ')
            cnt++;
            else break;
        }

        return cnt;
    }
}
