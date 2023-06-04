class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length ;
        boolean vis[] = new boolean[n] ;
        int cnt = 0 ;

        for(int i = 0 ;i<n;i++)
        {
            if(!vis[i])
            {
                cnt++;
                dfs(isConnected,i,vis) ;
            }
        }
        return cnt; 
    }
    public void dfs(int [][]isConnected ,int node,boolean []vis)
    {
        vis[node] = true ;
        for(int neighbour  = 0 ;neighbour<isConnected.length ;neighbour++){
            if(isConnected[node][neighbour]==1 && !vis[neighbour])
            dfs(isConnected,neighbour,vis);
        }
    }
}
