public class number_of_island {
    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    nullify(grid, i, j);
                    i = 0;
                    j = 0;
                    island++;
                }
            }

        }
        return island;
    }

    private static void nullify(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        // i
        if (i != 0 && grid[i - 1][j] == '1') {
            nullify(grid, i - 1, j);
        }
        if (i != grid.length - 1 && grid[i + 1][j] == '1') {
            nullify(grid, i + 1, j);
        }

        // j
        if (j != 0 && grid[i][j - 1] == '1') {
            nullify(grid, i, j - 1);
        }
        if (j != grid[i].length - 1 && grid[i][j + 1] == '1') {
            nullify(grid, i, j + 1);
        }
    }
}
