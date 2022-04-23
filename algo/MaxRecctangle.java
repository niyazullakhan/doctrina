package dp;

public class MaxRecctangle {
    public static void main(String[] args) {
      int[][] input = {{1,1,1},
              {0,1,1},
              {1,0,0}};




      int[][] visited = new int[input.length][input[0].length];
      int size = 0;

      for(int i=0; i<input.length; i++) {
          for(int j=0; j<input[i].length; j++) {
              if(visited[i][j]!=1)
                  size = Math.max(size, computeSize(input, visited, i, j));
          }
      }

        System.out.println(size);
    }

    public static int computeSize(int[][] input, int[][] visited, int i, int j) {
        if(i>input.length-1 || j>input.length-1 || visited[i][j]==1)
            return 0;
        visited[i][j]=1;

        return input[i][j] + computeSize(input, visited, i, j+1)
                    + computeSize(input, visited, i+1, j)
                    + computeSize(input, visited, i+1, j+1);

    }




//    public static void main(String[] args) {
//        int[][] input = {{1,1,1},
//                        {0,1,1},
//                        {1,0,1}};
//        boolean[][] visited = new boolean[input.length][input.length];
//        int maxSize =0;
//
//        for(int i=0; i<input.length; i++) {
//            for(int j=0; j<input.length; j++) {
//                if(!visited[i][j] && input[i][j]==1) {
//                    maxSize = Math.max(maxSize, computeArea(input, visited, i, j));
//                }
//            }
//        }
//        System.out.println(maxSize);
//    }
//
//    private static int computeArea(int[][] input, boolean[][] visited, int i, int j) {
//        if(i<input.length && j<input.length && !visited[i][j]) {
//            visited[i][j]=true;
//
//
//
//            return input[i][j] + computeArea(input, visited, i, j+1)
//                    + computeArea(input, visited, i+1, j)
//                    + computeArea(input, visited, i+1, j+1);
//        }
//        return 0;
//    }
}
