// Brute Force solution 
class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int res = 0 ;
        for(int i = 0 ;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                int temp = 0 ;

                for(int cnt[] : roads)
                if(cnt[0]==i || cnt[0]==j || cnt[1]==i || cnt[1] ==j)
                temp++ ;

                res = Math.max(res,temp);
            }
        }
        return res;
    }
}

// Efficient solution 
class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int []cnt = new int[n] ;
        int [][]direct = new int[n][n] ;

        for(int []road : roads)
        {
            cnt[road[0]]++;
            cnt[road[1]]++;

            direct[road[0]][road[1]]=1;
            direct[road[1]][road[0]]=1;
        }

        int rank = 0 ;

        for(int i = 0 ;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            rank = Math.max(rank , cnt[i]+cnt[j]-direct[i][j]);
        }

        return rank;
    }
}
