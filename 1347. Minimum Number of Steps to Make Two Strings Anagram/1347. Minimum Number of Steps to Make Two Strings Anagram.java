class Solution {
    public int minSteps(String s, String t) {
        int []countS = new int[26] ;
        int ans = 0 ;

        for(char ch : s.toCharArray())
        countS[ch-'a']++;

        for(char ch : t.toCharArray())
        if(countS[ch-'a']>0)
        countS[ch-'a']--;

        for(int i : countS)
        if(i>0) ans+=i ;

        return ans;
    }
}
