import javafx.util.Pair;

import java.util.*;

public class CostlyPath {
    public static void main(String[] args) {
        // beg -> right, bottom , <Set>
        int[][] input = {
                {9,9,7},
                {9,7,2},
                {6,9,5},
                {9,1,2}
        };

        int[][] sum = new int[input.length+1][input[0].length+1];
        List<Integer> path = new ArrayList<>();
        path.add(input[0][0]);
        for(int i=1; i<input.length; i++) {
            for(int j=1; j<input[0].length; j++) {
                int max = Math.max(sum[i-1][j], sum[i][j-1]);

                if(input[i-1][j]>input[i][j-1])
                    path.add(input[i-1][j]);
                else
                    path.add(input[i][j-1]);


                sum[i][j] = max+input[i-1][j-1];
            }
        }
        System.out.println(sum[sum.length-1][sum[0].length-1]);
        System.out.println(path);
        //
    }
}
