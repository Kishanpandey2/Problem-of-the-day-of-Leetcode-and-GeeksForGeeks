class Solution {
    private void dfs(int [][]grapth, List<List<Integer>>ans , List<Integer>path, int i)
    {
        path.add(i);
        if(i == grapth.length-1)
        ans.add(new ArrayList(path));
        else
        for(int in : grapth[i])
        dfs(grapth, ans, path,in);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList() ;
        List<Integer>path = new ArrayList() ;
        dfs(graph, ans, path,0);
        return ans ;
    }
}
