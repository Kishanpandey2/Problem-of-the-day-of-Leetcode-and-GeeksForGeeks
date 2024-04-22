
class Solution {
    int minRow(int n, int m, int a[][]) {
        int ans = 0 ;
        int one = 1001 ;
        for(int i = 0 ;i<n;i++ ){
            int cnt = 0 ;
            for(int j = 0 ;j<m;j++)
            {
                if(a[i][j] == 1)cnt++ ;
            }
            if(cnt<one)
            {
                one = cnt ;
                ans =  i+1 ;
            }
        }
        
        return ans;
    }
};
