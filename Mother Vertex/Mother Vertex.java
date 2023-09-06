// Using BFS 

class Solution
{
   
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
       int ans = -1 ;
       
       for(int i = 0 ;i<V;i++){
           Queue<Integer>q = new LinkedList<>() ;
           boolean []vis = new boolean[V] ;
           
           vis[i] = true ;
           int cnt = 1 ;
           
           q.add(i) ;
           while(!q.isEmpty()){
               int cur = q.poll() ;
               
               for(int nei : adj.get(cur)){
                   if(!vis[nei]){
                       cnt++ ;
                       vis[nei] = true ;
                       q.add(nei) ;
                   }
               }
           }
           
           if(cnt == V){
            ans = i;
               break;
           }
           
       }
       
       return ans;
    }
}

// Using DFS

class Solution
{
    
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int ans = -1 ;
        boolean []vis = new boolean[V] ;
        
        for(int i  = 0 ;i<V;i++){
            if(!vis[i]){
                dfs(i,adj,vis) ;
                ans = i ;
            }
        }
        
        boolean []vis1 = new boolean[V] ;
        dfs(ans,adj,vis1) ;
        for(boolean x: vis1)
        if(x == false)
        return -1;
        
        return ans;
        
    }
    
    private void dfs(int node , ArrayList<ArrayList<Integer>>adj , boolean []vis){
        vis[node]  = true ;
        
        for(int nei : adj.get(node)){
            if(!vis[nei])
            dfs(nei,adj,vis) ;
        }
    }
}
