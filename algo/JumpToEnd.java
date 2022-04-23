package qDS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class JumpToEnd {

    // [010010] --> prepare the index of 0's --> 0,2,3,5
    // start from 0, check if minjump takes
    public static void main(String[] args) {
        String s="010010";
        int minJump=2;
        int maxJump=3;
        System.out.println(canReach(s, minJump, maxJump));

    }

    public static boolean canReach(String s, int minJump, int maxJump) {
        int N = s.length();

        if (s.charAt(N-1) != '0') {
            return false;
        }

        Deque<Integer> zeros = new ArrayDeque<>(N);
        for (int i = 1; i < N; i++) {
            if (s.charAt(i) == '0') {
                zeros.add(i);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (!queue.isEmpty()) {
            int index = queue.poll();

            if (index == N-1) {
                return true;
            }

            while (!zeros.isEmpty() && zeros.peekFirst() < index + minJump) {
                zeros.pollFirst();
            }

            while (!zeros.isEmpty() && zeros.peekFirst() <= index + maxJump) {
                queue.add(zeros.pollFirst());
            }
        }
        return false;
    }

}
