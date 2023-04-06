class Solution {
public void dfs(int i, int j, int[][] grid) {
int m = grid.length, n = grid[0].length;
if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 0)
return;
grid[i][j] = 1;
int[] dx = {1, -1, 0, 0};
int[] dy = {0, 0, 1, -1};
for(int k=0;k<4;k++){
int nx = i + dx[k];
int ny = j + dy[k];
dfs(nx, ny, grid);
}
}

public int closedIsland(int[][] grid) {
int m = grid.length, n = grid[0].length;
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
if((i*j==0 || i==m-1 || j==n-1) && (grid[i][j]==0))
dfs(i, j, grid);
}
}
int count = 0;
for (int i = 1; i < m-1; i++) {
for (int j = 1; j < n-1; j++) {
if (grid[i][j] == 0) {
dfs(i, j, grid);
count++;
}
}
}
return count;
}
}
