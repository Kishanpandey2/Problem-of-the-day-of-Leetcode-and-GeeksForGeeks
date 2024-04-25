
class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        int mx = -1 ;
        
        if(n<=2 && m<=2)return -1;
        
        for(int i = 0;i<n-2;i++)
        {
            int sum = 0 ;
            for(int j = 0;j<m-2;j++)
            {
                sum = mat[i][j]+ mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2];
                mx = Math.max(mx,sum);
            }
        }
        return mx;
    }
};
