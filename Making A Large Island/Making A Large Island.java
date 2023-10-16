

class Solution {
    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};
    
    public int largestIsland(int N, int[][] grid) {
        int maxIslandSize = 0;
        int islandId = 2;
        HashMap<Integer, Integer> islandSizes = new HashMap<>();
        
        // Step 1: Mark each connected island with a unique ID and calculate their sizes
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (grid[r][c] == 1) {
                    int size = dfs(grid, r, c, islandId);
                    islandSizes.put(islandId, size);
                    maxIslandSize = Math.max(maxIslandSize, size);
                    islandId++;
                }
            }
        }
        
        // Step 2: Try changing '0' to '1' and check the size of the new island
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (grid[r][c] == 0) {
                    int size = 1; // If we change this '0' to '1'
                    HashSet<Integer> neighborIslandIds = new HashSet<>();
                    for (int i = 0; i < 4; i++) {
                        int nr = r + dr[i];
                        int nc = c + dc[i];
                        if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                            int neighborId = grid[nr][nc];
                            if (neighborId >= 2) {
                                neighborIslandIds.add(neighborId);
                            }
                        }
                    }
                    for (int neighborId : neighborIslandIds) {
                        size += islandSizes.get(neighborId);
                    }
                    maxIslandSize = Math.max(maxIslandSize, size);
                }
            }
        }
        
        return maxIslandSize;
    }
    
    // DFS to mark an island with a unique ID and calculate its size
    private int dfs(int[][] grid, int r, int c, int islandId) {
        int N = grid.length;
        int size = 0;
        grid[r][c] = islandId;
        
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < N && nc >= 0 && nc < N && grid[nr][nc] == 1) {
                size += dfs(grid, nr, nc, islandId);
            }
        }
        
        return size + 1;
    }
}
