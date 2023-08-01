class Solution {

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>al = new ArrayList<>() ;
        boolean []vis = new boolean[V];
        
        dfs(0,vis,adj,al) ;
        return al ;
    }
    private void dfs(int v,boolean []vis ,ArrayList<ArrayList<Integer>> adj , ArrayList<Integer>al  ){
        vis[v] = true ;
        al.add(v) ;
        for(int nei : adj.get(v)){
            if(!vis[nei])
            dfs(nei,vis,adj,al);
        }
    }
}
