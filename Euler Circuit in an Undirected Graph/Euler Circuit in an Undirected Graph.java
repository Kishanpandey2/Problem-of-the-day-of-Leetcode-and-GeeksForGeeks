
class Solution {
    public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        int []vis = new int[v+1] ;
        dfs(0,adj,vis) ;
        
        for(int i = 0 ;i<v;i++)
        if( vis[i]==0 && adj.get(i).size()>0)
        return false;
        
        int cnt = 0 ;
        for(int i = 0 ;i<v;i++){
            if(adj.get(i).size()%2 == 1)cnt++;
            
        }
        
        if(cnt>2)return false;
        
       
        return cnt == 0 ;
        
    }
    void dfs(int v,ArrayList<ArrayList<Integer>> adj,int []vis ){
        vis[v] = 1 ;
        
        for(int i : adj.get(v))
        if(vis[i] == 0)
        dfs(i,adj,vis) ;
    }
}
