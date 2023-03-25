class Solution {
    List<List<Integer>>adj ;
    boolean vis[] ;
    public long countPairs(int n, int[][] edges) {
        adj = new ArrayList<>() ;
        vis = new boolean[n] ;

        for(int i = 0 ;i<n;i++){
            adj.add(new ArrayList<>()) ;
        }

        for(int []edge : edges){
            int a = edge[0] ;
            int b = edge[1] ;

            adj.get(a).add(b) ;
            adj.get(b).add(a) ;
        }

        long total = ((long)n*(n-1))/2 ;

        for(int i= 0  ;i<n ;i++){
            if(!vis[i]){
                int nodes = dfs(i) ;
                long pair = ((long )nodes*(nodes-1))/2 ;
                total -= pair ;
            }
        }
        return total ;
    }
    public int dfs(int u){
        vis[u] = true ;
        int cnt = 1 ;

        for(int v : adj.get(u))
        {
            if(!vis[v])
            cnt += dfs(v) ;
        }
        return cnt ;
    }
}
