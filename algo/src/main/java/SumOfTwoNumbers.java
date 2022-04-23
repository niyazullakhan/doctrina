package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and a value, determine if there are any two
 * integers in the array whose sum is equal to the given value. Return true if the sum exists and return false if it does not.
 *
 * [2,4,6,1] , k=6
 * [2,4], [6]
 *
 * [0,1], [2]
 *
 * 2
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
//        int[] input = {2,4,6,1,5,1,6};
//        int k = 6;
//
//        Map<Integer, Integer> indexMap = new HashMap<>();
//
//        String a = "sjhds";
//
//        for(int i=0; i<input.length; i++) {
//            int diff = Math.abs(k-input[i]);
//            if(diff ==0) {
//                System.out.println(i);
//            } else if(indexMap.getOrDefault(diff, -1) != -1) {
//                System.out.println(indexMap.get(diff)+":"+i);
//            }
//
//            indexMap.put(input[i], i);
//        }

        String input = "b";
        if(input.length()<2) {
            System.out.println("true");
            System.exit(0);
        }


        int s = 0;
        int e = input.length()-1;

        while(s<=e) {
            if(input.charAt(s) <= input.charAt(s+1) && input.charAt(e)>=input.charAt(e-1)) {
                s++;
                e--;
            } else {
                System.out.println(false);
                System.exit(-1);
            }
        }

        System.out.println(true);
    }
}
