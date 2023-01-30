class Solution{
    public int countVertex(int N, int[][] edges){
         ArrayList<Integer> adj[]=new ArrayList[N+1];
        for(int i=0;i<=N;i++)
        adj[i]=new ArrayList<>();
        for(int i=0;i<N-1;i++)
        {
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }
        //s2
        int[][]val=new int[N+1][2];
        for(int i=1;i<=N;i++)
            val[i][1]=1;
            
        //s3
        solve(adj, 1,1, val);
        return Math.min(val[1][0], val[1][1]);
    }
    // we do not process the leaf node
    public void solve(ArrayList<Integer> adj[] , int source, int parent, int val[][])
    {
        for(Integer v: adj[source])
       { if(v!=parent)  //do not process the leaf node
        {
         solve(adj, v, source, val);   
        }
       }
        for(Integer v: adj[source])
        {
            if(v!=parent)
            {
                val[source][0]  += val[v][1];  // camera++;
                val[source][1] += Math.min(val[v][1], val[v][0]);
            }
        }
    }
    
    
}
