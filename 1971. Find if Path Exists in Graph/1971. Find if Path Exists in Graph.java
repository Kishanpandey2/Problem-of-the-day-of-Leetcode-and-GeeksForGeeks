class Solution {
    boolean flag = false ;
    private void dfs(HashMap<Integer,List<Integer>>gr ,boolean []vis, int source , int destination)
    {
        if(vis[source] ||flag)
        return ;
        vis[source ]=true;
        for(int n  : gr.get(source))
        {
            if(n == destination )
           { flag = true;
           break ;}
           if(!vis[n])
           {
                dfs(gr,vis, n ,destination) ;
           }
                    }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination )
        return true ;
        HashMap<Integer,List<Integer>>gr = new HashMap<>()  ;
        boolean vis[] = new boolean[n] ;
        for(int i =0 ;i<n;i++)
        {
            gr.put(i,new ArrayList<>()) ;

        }
        for(int []edge : edges)
        {
                gr.get(edge[0]).add(edge[1]);
                gr.get(edge[1]).add(edge[0]);
        }
        dfs(gr,vis, source ,destination) ;
        return flag ;
    }
}
