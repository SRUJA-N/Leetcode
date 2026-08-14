class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    island++;
                    bfsGrid(grid, i, j);
                }
            }
        }
        return island;
    }
    
    public void bfsGrid(char[][] grid, int R, int C) {
        int row = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{R, C});
        grid[R][C] = '0';

        while (!q.isEmpty()) {
            int[] num = q.poll();
            int r = num[0]; 
            int c = num[1]; 
            
            for (int[] dir : directions) {
                int newR = dir[0] + r;
                int newC = dir[1] + c;
                
                if (newR >= 0 && newC >= 0 && newR < row && newC < cols && grid[newR][newC] == '1') {
                    grid[newR][newC] = '0';
                    q.offer(new int[]{newR, newC});
                }
            }
        }
    }
}