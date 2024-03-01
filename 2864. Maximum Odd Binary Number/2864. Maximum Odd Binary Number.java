class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0 ;

        for(char ch : s.toCharArray()) if(ch == '1')ones++ ;

        int i = 0 ;
        StringBuilder sb = new StringBuilder()  ;

        for( ;i<ones-1;i++)
        sb.append('1') ;

        for(;i<s.length()-1;i++)
        sb.append('0'); 

        sb.append('1');

        return sb.toString();
    }
}
