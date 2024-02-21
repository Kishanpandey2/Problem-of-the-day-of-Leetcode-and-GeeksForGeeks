class Solution {
    public int rangeBitwiseAnd(int left, int right) {

           int cnt = 0 ;

           while(left != right)
           {
               cnt++;
               left >>= 1;
               right >>=1 ;
           }

        return right<<cnt;

    }
}
