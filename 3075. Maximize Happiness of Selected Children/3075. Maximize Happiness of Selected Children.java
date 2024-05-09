class Solution {
    public long maximumHappinessSum(int[] happ, int k) {
        Arrays.sort(happ) ;

        long sum = 0 ;
        int cnt = 0 ;
        for(int  i= happ.length -1 ;i>= 0 ;i--)
        {
            sum += (happ[i]-cnt > 0)?(long)(happ[i]-cnt) : 0 ;
            cnt++;
            if(cnt == k)break;
        }
        return sum;
    }
}
