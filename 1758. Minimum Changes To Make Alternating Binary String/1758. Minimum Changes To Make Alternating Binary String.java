class Solution {
    int check(String  s, char ch){
        int total = 0 ;

        for(int i = 0 ;i<s.length();i++)
        {
            if(s.charAt(i)!= ch)
            total++;

            if(ch =='1')
            ch = '0';
            else
             ch = '1';
        }
        return total ;
    }
    public int minOperations(String s) {
        return Math.min(check(s, '1'),check(s,'0'));
    }
}
