package gfg.fb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class LargestNumInArray {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer a, Integer b) {
                        String xy = String.valueOf(a) + String.valueOf(b);
                        String yx = String.valueOf(b) + String.valueOf(a);
                        int value = xy.compareTo(yx);
                        if (value > 0) {
                            return -1;
                        } else if (value < 0) {
                            return 1;
                        } else {
                            return 0;
                        }

                    }
                });



        Integer[] input ={0, 3, 30, 34, 5, 9};

//        pq.addAll(Arrays.asList(input));
         pq.offer(3);
        pq.offer(30);
        pq.offer(34);
        pq.offer(5);
        pq.offer(9);

        String num="";

        while(!pq.isEmpty()) {
            num=num.concat(pq.peek().toString());
            pq.remove();
        }

        System.out.println(num);

    }
}
