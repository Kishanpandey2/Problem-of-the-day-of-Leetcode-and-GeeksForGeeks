class Solution
{
    public int[] leastPrimeFactor(int n)
    {
         int ans[] = new int[n+1];
        Arrays.fill(ans,0);
        ans[1]=1;
        for(int i=2;i<=n;i++){
            if(ans[i]==0){
                ans[i]=i;
                for(int j=2*i;j<=n;j+=i){
                    if(ans[j]==0){
                        ans[j]=i;
                    }
                }
            }
        }
        return ans;
    }
}
