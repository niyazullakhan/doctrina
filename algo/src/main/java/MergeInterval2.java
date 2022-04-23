package arrays;

public class MergeInterval2 {
    public static void main(String[] args) {
        int[][] input = {{1, 5}, {3, 7}, {4, 6}, {6, 8}, {10, 12}, {12, 15}};

        int[] interval = {2, 11};

        int[] temp = {0, 0};
        for (int i = 0; i < input.length; i++) {
            if (input[i][1] < interval[0]) {
                if (temp[0] > 0 && temp[1] > 0)
                    System.out.println(temp);
                else
                    System.out.println(input[i]);
                continue;
            }




        }
    }
}
