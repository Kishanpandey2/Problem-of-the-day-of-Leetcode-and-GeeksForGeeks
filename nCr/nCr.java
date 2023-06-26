
class Solution{
    static int nCr(int n, int r)
    {
        if(r>n)
            return 0;
        int mod=1000000007;
        int d[]=new int[r+1];
        for(int i=1;i<=n;i++)
        {
            
            d[0]=1;
            for(int j=r;j>0;j--)
            {
                d[j]=(d[j]+d[j-1])%mod;
            }
        }
        return d[r];
    }
}
