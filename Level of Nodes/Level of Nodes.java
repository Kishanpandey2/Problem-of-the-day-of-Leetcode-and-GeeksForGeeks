
class Solution
{
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        Queue<Integer>q = new LinkedList<>()  ;
        int []vis = new int[V] ;
        
        int level = 0 ;
        
        q.add(0) ;
        
        while(!q.isEmpty()){
            int size = q.size() ;
            
            for(int i = 0 ;i<size ;i++){
                int cur = q.poll() ;
                
                if(cur == X)return level ;
                
                for(int nei : adj.get(cur)){
                    if(vis[nei]==0)
                    {
                        q.add(nei) ;
                        vis[nei] = 1 ;
                    }
                }
            }
            level++ ;
        }
        
        return -1;
    }
}
