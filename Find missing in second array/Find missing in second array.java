

class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> ans  = new ArrayList<>();
         Set<Integer>st = new HashSet<>() ;
        
        for(int i : b)
        st.add(i);
        
        for(int i :a )
        {
            if(!st.contains(i))
            {
                ans.add(i);
            }
           
        }
        return ans;
    }
}
