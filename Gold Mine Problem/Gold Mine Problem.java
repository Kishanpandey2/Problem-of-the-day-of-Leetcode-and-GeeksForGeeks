
class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        for(int col = m-2;col>=0;col--){
            for(int row = 0;row<n;row++){
                int right = M[row][col+1] ;
                int rightUp = (row == 0)?0: M[row-1][col+1] ;
                    int rightDown = (row == n-1)?0: M[row+1][col+1] ;
                    
                    M[row][col] = M[row][col]+Math.max(right,Math.max(rightUp,rightDown));
            }
        }
        int ans = M[0][0] ;
        
        for(int i = 1;i<n;i++)
        {
            ans= Math.max(ans,M[i][0]);
        }
        
        return ans;
    }
}
