package Graph;

import java.util.*;

class Solution {
    // Function to perform BFS
    public void bfs(int row, int col, boolean[][] vis, char[][] grid) {
        // Create queue for BFS
        Queue<int[]> q = new LinkedList<>();
        // Add starting cell
        q.add(new int[]{row, col});
        // Mark as visited
        vis[row][col] = true;

        // Define 8 directions
        int[] drow = {-1,-1,-1, 0, 1, 1, 1, 0};
        int[] dcol = {-1, 0, 1, 1, 1, 0,-1,-1};

        // While queue not empty
        while (!q.isEmpty()) {
            // Get front cell
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            // Traverse 8 directions
            for (int i = 0; i < 8; i++) {
                // New row and column
                int nr = r + drow[i];
                int nc = c + dcol[i];

                // Check if valid and unvisited land
                if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        !vis[nr][nc] && grid[nr][nc] == '1') {

                    // Mark and add to queue
                    vis[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
            }
        }
    }

    // Function to count islands
    public int numIslands(char[][] grid) {
        // Get dimensions
        int n = grid.length;
        int m = grid[0].length;

        // Visited array
        boolean[][] vis = new boolean[n][m];

        // Count variable
        int count = 0;

        // Traverse entire grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If unvisited land
                if (!vis[i][j] && grid[i][j] == '1') {
                    // Increment count
                    count++;
                    // Call BFS
                    bfs(i, j, vis, grid);
                }
            }
        }

        // Return final count
        return count;
    }
}

public class NoOfDistinctIslands {
    public static void main(String[] args) {
        // Create grid
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        // Create object
        Solution sol = new Solution();
        // Call function and print result
        System.out.println(sol.numIslands(grid));
    }
}

