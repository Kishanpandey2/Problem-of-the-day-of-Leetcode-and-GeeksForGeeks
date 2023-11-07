class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        ArrayList<Double>time = new ArrayList<>() ;

        for(int i = 0 ;i<dist.length;i++){
            time.add((double)dist[i]/speed[i]) ;
        }

            Collections.sort(time);
        int ans = 0 , t =0;

        for(double k : time)
        {
            if(k<=t)break ;
            else
            {
                t++ ;
                ans++;
            }
        }

        return ans;
    }
}
