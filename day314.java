class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        int[][] directions = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
        };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && !visited[i][j]) {
                    long sum = dfs(grid, visited, i, j,
                                   m, n, directions);
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private long dfs(int[][] grid, boolean[][] visited,
                     int row, int col, int m, int n,
                     int[][] directions) {
        visited[row][col] = true;
        long sum = grid[row][col];
        for (int[] dir : directions) {
            int nr = row + dir[0];
            int nc = col + dir[1];
            if (nr >= 0 && nr < m &&
                nc >= 0 && nc < n &&
                grid[nr][nc] > 0 &&
                !visited[nr][nc]) {
                sum += dfs(grid, visited, nr, nc,
                           m, n, directions);
            }
        }
        return sum;
    }
}