public class island_perimetr {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int P = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // Число граней имеет прямую зависимость с периметром: P[i][j] == 4 - edge
                if (grid[i][j] == 1) {
                    int edge = 4;
                    if (i != 0 && grid[i - 1][j] == 1) edge--;
                    if (i != grid.length - 1 && grid[i + 1][j] == 1) edge--;

                    if (j != 0 && grid[i][j - 1] == 1) edge--;
                    if (j != grid[i].length - 1 && grid[i][j + 1] == 1) edge--;

                    P+= edge;
                }
            }
        }
        return P;
    }
}
