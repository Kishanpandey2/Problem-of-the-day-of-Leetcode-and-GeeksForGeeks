class Solution {
    public boolean isPowerOfFour(int n) {
        double no = Math.log(n)/Math.log(4) ;
        double res = no - (int)no ;

        return res==0.0;
    }
}
