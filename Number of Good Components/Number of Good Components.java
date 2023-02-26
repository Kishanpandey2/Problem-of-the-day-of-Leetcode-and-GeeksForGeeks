class Solution {
    static int total_nodes = 0  ;
     static boolean fullyConnected = true ;
    public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean []visited = new boolean[V+1] ;
       int count = 0 ;
       for(int i = 1;i<=V;i++){
           if(!visited[i]){
               total_nodes = 0  ;
               fullyConnected = true ;
               int degree = adj.get(i).size() ;
               dfs(i,degree,visited,adj) ;
               if(fullyConnected &&(( total_nodes - 1) == degree))
               count++;
           }
       }
       return count ;
    }
    public void dfs(int node ,int size , boolean []visited  , ArrayList<ArrayList<Integer>> adj){
        visited[node ] = true ; 
        total_nodes++;
        if(size != adj.get(node).size())
        fullyConnected = false ;
        
        for(int neighbour  : adj.get(node)){
            if(!visited[neighbour])
            dfs(neighbour , size, visited , adj) ;
        }
    }
    
}
