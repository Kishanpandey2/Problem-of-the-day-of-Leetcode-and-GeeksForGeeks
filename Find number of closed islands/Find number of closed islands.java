
class Solution
{public int closedIslands(int[][] mat, int N, int M)
    {
        boolean[][] vis = new boolean[N][M];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!vis[i][j] && !c_c(i,j,N,M) && mat[i][j]==1) {
                    boolean[] hasCorner = new boolean[1];
                    bfs(mat, vis, i, j, N, M, hasCorner);
                    if (!hasCorner[0]) cnt++;
                }
            }
        }
        return cnt;
    }
    
    void bfs(int[][] mat, boolean[][] vis, int x, int y, int n, int m, boolean[] hasCorner) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        vis[x][y] = true;
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int cx = curr[0], cy = curr[1];
            if (c_c(cx, cy, n, m) && mat[cx][cy] == 1) hasCorner[0] = true;
            
            int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] dir : dirs) {
                int nx = cx + dir[0], ny = cy + dir[1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !vis[nx][ny] && mat[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});
                    vis[nx][ny] = true;
                }
            }
        }
    }
    
    boolean c_c(int i, int j, int n, int m) {
        return i == 0 || j == 0 || i == n-1 || j == m-1;
    }
}
