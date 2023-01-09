
class Solution
{
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer>st = new Stack<>() ;
        int []ans = new int[V] ;
        boolean []vis = new boolean[V] ;
        for(int i = 0 ;i<V;i++)
        {
            if(!vis[i])
            dfs(i,adj,vis,st) ;
        }
        int i = 0 ;
        while(!st.isEmpty())
        ans[i++]= st.pop();
        return ans ;
    }
    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj,boolean [] vis , Stack<Integer> st )
    {
        vis[v]= true ;
        for(Integer neighbour : adj.get(v))
        {
            if(!vis[neighbour])
            dfs(neighbour,adj,vis,st) ;
        }
        st.push(v) ;
    }
}
