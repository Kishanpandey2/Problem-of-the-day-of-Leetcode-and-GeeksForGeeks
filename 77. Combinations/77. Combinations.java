class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>  ans = new ArrayList<>() ;
        combination(1,n,new ArrayList<>() , ans,k) ;
        return ans;
    }
    private void combination(int start , int n , List<Integer>cur,List<List<Integer>>  ans ,int k  ){
        if(cur.size() == k)
        {
            ans.add(new ArrayList(cur)) ; return ;
        }

        for(int i = start;i<=n;i++)
        {
            cur.add(i) ;
            combination(i+1,n,cur,ans,k) ;
            cur.remove(cur.size()-1);
        }
    }
}
