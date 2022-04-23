public class MaximumAreaOfIsland {
    private static int size = 0;

    private static boolean visted[][] = new boolean[15][15];


    public static void main(String[] args) {
        int[][] islandGrid =
                {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
//        int[][] islandGrid = new int[][]
//                {{1, 1, 0},
//                        {0, 1, 0},
//                        {1, 0, 0,}};

        int tempSize;
        for (int i = 0; i < islandGrid.length; i++) {
            for (int j = 0; j < islandGrid.length; j++) {
//                if (islandGrid[i][j] == 1) {
                    size = Math.max(parseIsland(islandGrid, i, j), size);
//                    if (tempSize > size)
//                        size = tempSize;
//                }
            }
        }
        System.out.println(size);

    }

    private static int parseIsland(int[][] islandGrid, int i, int j) {
        if (i < 0 || j < 0 || i >= islandGrid.length || j >= islandGrid.length || visted[i][j] || islandGrid[i][j] == 0) {
            return 0;
        }
        visted[i][j] = true;

        return parseIsland(islandGrid, i - 1, j - 1) +
                parseIsland(islandGrid, i - 1, j) +
                parseIsland(islandGrid, i - 1, j + 1) +
                parseIsland(islandGrid, i, j - 1) +
                parseIsland(islandGrid, i, j + 1) +
                parseIsland(islandGrid, i + 1, j - 1) +
                parseIsland(islandGrid, i + 1, j) +
                parseIsland(islandGrid, i + 1, j + 1)+1;
    }

}
