
class Solution {
    public int findCoverage(int[][] mat) {
        int ans = 0 ;
        
        for(int i = 0 ;i<mat.length;i++){
            for(int j = 0 ;j<mat[0].length;j++){
                if(mat[i][j] == 0 )
                {
                    if(j-1>=0 && mat[i][j-1]==1)
                    ans++;
                      if(j+1<mat[0].length && mat[i][j+1]==1)ans++;
                      if(i-1>=0 && mat[i-1][j]==1)ans++;
                      if(i+1<mat.length && mat[i+1][j]==1)ans++;
                    
                }
            }
        }
        
        return ans;
    }
}
