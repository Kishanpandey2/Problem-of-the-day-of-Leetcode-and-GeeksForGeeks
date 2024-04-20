class Solution
{
    public static ArrayList<Integer> findUnion(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>() ;
        
        int i = 0 , j = 0 ;
        while(i<n && j<m)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++ ; continue ;
            }
                if(j>0 && b[j]==b[j-1])
            {
                j++ ; continue ;
            }
            
            if(a[i]<b[j])
            {
                ans.add(a[i]); i++;
            }
            else if(a[i]>b[j])
            {
                ans.add(b[j]); j++;
            }
            else
            {
                ans.add(a[i]); i++; j++;
            }
        }
        
        while(i<n )
        {
            if(i==0 || a[i]!=a[i-1])
            ans.add(a[i]);
            i++;
        }
        while(j<m )
        {
            if(j==0 || b[j]!=b[j-1])
            ans.add(b[j]);
            j++;
        }
        
        return ans;
    }
}



