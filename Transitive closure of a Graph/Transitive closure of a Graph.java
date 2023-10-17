
class Solution{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
    {
        int [][]adj = new int[N][N] ;
        
        for(int i =  0 ;i<N;i++){
            for(int j = 0 ;j<N;j++)
            if(graph[i][j]==1 && i!= j)
            adj[i][j] = 1 ;
        }
        
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;
         for(int i = 0 ;i<N;i++){
             ans.add(new ArrayList<>()) ;
             for(int  j= 0 ;j<N;j++){
                 ans.get(i).add(0) ;
             }
         }
         
         for(int i = 0 ;i<N;i++)
         {
            dfs(i,i,adj,ans);
         }
         
         return ans;
    }
    
    public static void dfs(int i ,int j ,int [][]adj,   ArrayList<ArrayList<Integer>> ans){
        ans.get(i).set(j,1) ;
        
        for(int it = 0 ;it<adj[j].length;it++){
            if(adj[j][it]==1 && ans.get(i).get(it)==0)
            dfs(i,it,adj,ans);
        }
    }
}
