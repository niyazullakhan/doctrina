import java.util.Comparator;
import java.util.PriorityQueue;

public class TopKElementInArray {
    public static void main(String[] args) {
        int[] input = new int[]{3, 1, 6, 12, 89, 45, 8, 11, 80};
        //1,3,6,8,12,45,89

        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2-o1);

        for (int i = 0; i < input.length; i++) {

            heap.add(input[i]);

            if(i>4) {
                heap.remove();
            }

        }

        System.out.println("5th Max: "+heap.peek());
    }
}
