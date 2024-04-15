
class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int []ans = new int[query.length]  ;
        int ind = 0 ;
        
        for(int que : query){
            int ele = a[que] ;
            int cnt = 0 ;
            for(int i = 0 ;i<n;i++)
            {
                if(b[i]<=ele)cnt++;
            }
            ans[ind++] = cnt ;
        }
        
        return ans;
    }
}
