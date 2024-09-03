class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder() ;

        for(char ch : s.toCharArray()){
            int ind = (ch-'a')+1 ;

            sb.append(ind+"");
        }

        int digitSum =0 ;

        for(char ch : sb.toString().toCharArray())
        digitSum += (ch-'0') ;
        k--;
        while(k>0){
            int temp  = digitSum ;
            digitSum = 0 ;
            while(temp>0)
            {
                digitSum += temp%10 ;
                temp /=10;
            }
            k--;

        }

        return digitSum ;
    }
}
