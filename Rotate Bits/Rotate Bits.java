
class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        ArrayList<Integer>ans = new ArrayList<>()  ;
        
         D = D%16  ;
        ans.add(((N<<D)|(N>>(16-D))) & 65535 ) ;
        ans.add(((N>>D)|(N<<(16-D)))&65535 ) ;
        
        return ans;
    }
}
