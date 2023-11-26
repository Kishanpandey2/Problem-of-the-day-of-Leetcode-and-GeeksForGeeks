
class Solution{
    public List<Integer> pattern(int N){
        List<Integer>ans = new ArrayList<>() ;
        int t = N ;
        
        
        while(t>0 )
        {
            ans.add(t) ;
            t-=5 ;
        }
        
        while(t!=N)
        {
            ans.add(t) ;
            t+=5 ;
        }
        
        ans.add(N);
        return ans;
    }
}
