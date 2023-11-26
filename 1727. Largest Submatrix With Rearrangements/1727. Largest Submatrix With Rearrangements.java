class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int ans = 0 ;

        int m = matrix.length , n = matrix[0].length ;
        
        for(int i = 1 ;i<m ;i++)
        {
            for(int j = 0 ;j<n;j++)
            if(matrix[i][j]==1)
            matrix[i][j] = matrix[i-1][j]+1 ;
        }

        for(int row[] : matrix){
            Arrays.sort(row) ;

            for(int j = n-1,k = 1; j>=0 && row[j]>0 ; j--,k++)
            {
                int area = row[j]*k ;
                ans = Math.max(ans,area);
            }

        }
        return ans;
            
        }
}
