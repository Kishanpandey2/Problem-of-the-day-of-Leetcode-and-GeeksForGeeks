class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int mx  = 0, s = 0 ;
        int l = 0 , r = tokens.length-1;

        while(l<=r){
            if(power>= tokens[l])
            {
                power -= tokens[l];
                s++ ;
                l++ ;
                mx = Math.max(mx,s);
            }
            else if(s>0)
            {
                power += tokens[r];
                r--;
                s--;
            }
            else
            break;
        }
        return mx ;
    }
}
