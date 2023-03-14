
class Solution{
    int maxCoins(int N, ArrayList<Integer> arr) {
		  int [][]dp = new int[arr.size()][arr.size()] ;
        for(int g = 0  ;g<dp.length ;g++)
        {
            for(int i = 0,j = g ;j<dp.length; j++,i++)
            {
                int mx = Integer.MIN_VALUE ;
                for(int k = i ;k<=j;k++)
                {
                    int l = k==i?0:dp[i][k-1] ;
                    int r = k==j?0:dp[k+1][j] ;
                    int val = (i==0?1:arr.get(i-1) )* arr.get(k) *( j== arr.size()-1 ? 1: arr.get(j+1)) ;
                    int sum = l+r+val ;
                    if(sum>mx)
                    mx= sum ;
                }
                dp[i][j]= mx ;
            }
            
        }
        return dp[0][arr.size()-1] ;
	}
}
