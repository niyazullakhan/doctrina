public class NumberofIslands {
    static int count = 0;
    static boolean[][] visted = new boolean[10][10];

    public static void main(String[] args) {
        int[][] islandGrid = new int[][]
                        {{1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 1, 0, 1}};
        for (int i = 0; i < islandGrid.length; i++) {
            for (int j = 0; j < islandGrid[i].length; j++) {
                if (islandGrid[i][j] == 1 && !visted[i][j]) {
                    parseIsland(islandGrid, i, j);
                    ++count;
                }
            }
        }
        System.out.println(count);
    }


    private static void parseIsland(int[][] islandGrid, int i, int j) {
        if (i >= 0 && j >= 0 && i < islandGrid.length && j < islandGrid.length) {
            if (visted[i][j]) {
                return;
            }
            visted[i][j] = true;

            if (islandGrid[i][j] == 1) {
                parseIsland(islandGrid, i, j - 1);
                parseIsland(islandGrid, i, j + 1);
                parseIsland(islandGrid, i - 1, j - 1);
                parseIsland(islandGrid, i - 1, j);
                parseIsland(islandGrid, i - 1, j + 1);
                parseIsland(islandGrid, i + 1, j - 1);
                parseIsland(islandGrid, i + 1, j);
                parseIsland(islandGrid, i + 1, j + 1);

            }
        }

    }


}
