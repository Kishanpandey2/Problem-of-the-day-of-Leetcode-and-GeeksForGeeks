class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0 ;

        int left =  0, wind= 0  ;

        for(int right = 0 ;right<s.length();right++)
        {
            wind += (Math.abs(s.charAt(right) - t.charAt(right))) ;

            while(wind> maxCost)
            {
                wind -=  (Math.abs(s.charAt(left) - t.charAt(left))) ;
                left++;
            }

            ans = Math.max(ans,right -left +1) ;
        }

        return ans;
    }
}
