class Solution {
    public int dfs(int node, int parent, Map<Integer, List<Integer>> map,
            List<Boolean> hasApple) {
        if (!map.containsKey(node))
            return 0;

        int ans = 0, childTime = 0;
        for (int child : map.get(node)) {
            if (child == parent)
                continue;
            childTime = dfs(child, node, map, hasApple);
            if (childTime > 0 || hasApple.get(child))
                ans += childTime + 2;
        }
        return ans;
    }

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            map.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            map.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        return dfs(0, -1, map, hasApple);
    }
}
