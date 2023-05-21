class Solution {
    private int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int shortestBridge(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int startI = -1;
        int startJ = -1;
        boolean found = false;

        // Step 1: Find the first island using DFS
        for (int i = 0; i < m; i++) {
            if (found) {
                break;
            }
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    startI = i;
                    startJ = j;
                    found = true;
                    break;
                }
            }
        }

        Set<Integer> visited = new HashSet<>();
        dfs(grid, startI, startJ, visited);

        // Step 2: Perform BFS from the first island to find the shortest bridge
        Queue<Integer> queue = new ArrayDeque<>(visited);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                int currI = curr / n;
                int currJ = curr % n;

                for (int[] dir : directions) {
                    int ni = currI + dir[0];
                    int nj = currJ + dir[1];
                    int neighbor = ni * n + nj;

                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && !visited.contains(neighbor)) {
                        if (grid[ni][nj] == 1) {
                            return level;
                        }
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
            level++;
        }

        return -1; // No bridge found
    }

    private void dfs(int[][] grid, int i, int j, Set<Integer> visited) {
        int m = grid.length;
        int n = grid[0].length;
        int curr = i * n + j;

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1 || visited.contains(curr)) {
            return;
        }

        visited.add(curr);

        for (int[] dir : directions) {
            int ni = i + dir[0];
            int nj = j + dir[1];
            dfs(grid, ni, nj, visited);
        }
    }
}
