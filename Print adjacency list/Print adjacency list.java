class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
       List<List<Integer>> ans = new ArrayList<>() ;
       
       
       for(int i = 0 ;i<V;i++)
           ans.add(new ArrayList<>() ) ;
           
           
           
        for(int i = 0 ;i<edges.length ;i++){
            ans.get(edges[i][0]).add(edges[i][1]);
            ans.get(edges[i][1]).add(edges[i][0]);
        }
        
        
        return ans;
       
    }
}
