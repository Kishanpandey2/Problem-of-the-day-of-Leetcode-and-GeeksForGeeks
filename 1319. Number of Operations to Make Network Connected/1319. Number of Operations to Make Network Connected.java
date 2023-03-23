class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;
        
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new HashSet<>());
        for (int[] connection : connections) {
            int u = connection[0], v = connection[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        int[] visited = new int[n];
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                components++;
                dfs(i, graph, visited);
            }
        }
        
        return components - 1;
    }
    
    private int dfs(int node, List<Set<Integer>> graph, int[] visited) {
        if (visited[node] != 0) return 0;
        visited[node] = 1;
        for (int neighbor : graph.get(node)) dfs(neighbor, graph, visited);
        return 1;
    }
}
