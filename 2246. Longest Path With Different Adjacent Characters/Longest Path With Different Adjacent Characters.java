class Solution {
    private int res = 1 ;
    private int[] distance = new int[100001] ;
    private void dfs(int source , String s, List<List<Integer>>adj  )
    {
        distance[source]= 1 ;
        for(int node : adj.get(source))
        {
            dfs(node,s,adj) ;
            if(s.charAt(source)!= s.charAt(node))
            {
                res = Math.max(res,distance[source]+distance[node]) ;
                distance[source]= Math.max(distance[source],distance[node]+1);
            }
        }
    }
    public int longestPath(int[] parent, String s) {
        List<List<Integer>>adj  = new ArrayList<>() ;
        for(int i = 0;i<parent.length;i++)
         adj.add(new ArrayList<>()) ;
        for(int i = 1;i<parent.length ;i++)
        {
            adj.get(parent[i]).add(i) ;
        }
        dfs(0,s,adj) ;
        return res ;

    }
}
