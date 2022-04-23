package arrays;

import com.sun.javafx.collections.ImmutableObservableList;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] input = {{1,5}, {3,7}, {4,6}, {6,8}, {10,12}, {12,15}};
        List<List<Integer>> result = new ArrayList<>();




        if(input.length<2)
            System.out.println(input);

        else {


            int temp[] = input[0];

            for(int i=1; i<input.length; i++) {
                int[] curr = input[i];
                if(temp[1]<curr[0]) {
                    int[] finalTemp = temp;
                    result.add(new ArrayList<Integer>(){{
                        add(finalTemp[0]);add(finalTemp[1]);}});
                    temp=input[i];
                } else {
                    temp[0] = temp[0];
                    temp[1] = curr[1];
                }
            }
            List<Integer> t = Arrays.asList(temp[0], temp[1]);
            result.add(t);


        }

        System.out.println(result);


    }
}
