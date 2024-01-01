class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0 ;
        Arrays.sort(s) ;
        Arrays.sort(g ) ;
        int cur = 0 ;
       for(int i = 0 ;i<s.length;i++){
            if(cur<g.length && g[cur]<=s[i])
            cur++;
       }

        return cur;
    }
}
