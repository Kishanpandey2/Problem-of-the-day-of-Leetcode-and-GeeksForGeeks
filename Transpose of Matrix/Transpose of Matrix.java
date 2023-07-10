class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int i = 0 ;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                  swap(a,i,j);
            }
        }
    }
    void swap(int [][]a, int i,int j){
        int t1 = a[j][i] ;
        int t2 = a[i][j] ;
        a[j][i] = t2;
        a[i][j] = t1;
    }
}
