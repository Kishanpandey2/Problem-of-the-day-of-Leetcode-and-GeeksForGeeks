class Solution {
    public int findJudge(int n, int[][] trust) {
        int []cnt = new int[n+1] ;
        for(int []i: trust)
        {
            cnt[i[0]]-- ;
            cnt[i[1]]++ ;
        }
        for(int i = 1;i<=n;i++)
        {
            if(cnt[i]==n-1)
            return i ;
        }
        return -1;
    }
}
