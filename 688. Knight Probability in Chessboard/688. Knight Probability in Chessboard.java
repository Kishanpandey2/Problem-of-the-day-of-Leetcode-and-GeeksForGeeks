class Solution {
    private boolean isValid(int i ,int j , int n)
    {
        if(i>=0 && j>=0 && i<n && j<n)
        return true;

        return false;
    }
    public double knightProbability(int n, int k, int row, int column) {
        double sum = 0.0 ;
        double [][]cur = new double[n][n] ;
        double [][]next = new double[n][n] ;

        cur[row][column] = 1 ;

        for(int m = 1;m<=k;m++)
        {
            for(int i = 0 ;i<n;i++)
            {
                for(int j =  0 ;j<n;j++)
                {
                    if(cur[i][j]!=0){
                    int ni = 0, nj  = 0;

                    ni = i-2;
                    nj = j+1;
                    if(isValid(ni,nj,n))
                    next[ni][nj] += cur[i][j]/8.0;

                    ni = i-1;
                    nj = j+2;
                     if(isValid(ni,nj,n))
                    next[ni][nj] += cur[i][j]/8.0;

                    ni = i+1;
                    nj = j+2;
                     if(isValid(ni,nj,n))
                    next[ni][nj] += cur[i][j]/8.0;

                    ni = i+2;
                    nj = j+1;
                         if(isValid(ni,nj,n))
                    next[ni][nj] += cur[i][j]/8.0;

                    ni = i+2;
                    nj = j-1;
                     if(isValid(ni,nj,n))
                    next[ni][nj] += cur[i][j]/8.0;

                    ni = i+1;
                    nj = j-2;
                     if(isValid(ni,nj,n))
                    next[ni][nj] += cur[i][j]/8.0;

                    ni = i-1;
                    nj = j-2;
                     if(isValid(ni,nj,n))
                    next[ni][nj] += cur[i][j]/8.0;

                    ni = i-2;
                    nj = j-1;
                     if(isValid(ni,nj,n))
                    next[ni][nj] += cur[i][j]/8.0;
                    }
                }
            }
            cur = next ;
            next = new double[n][n];
        }

        for(int i =0 ;i<n;i++)
        {
            for(int j = 0 ;j<n;j++)
            sum+=cur[i][j];
        }
        return sum;
    }
}
