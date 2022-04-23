public class MinimumStepsToFillBalls {
    /**
     * You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.
     *
     * In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.
     *
     * Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.
     *
     * Each answer[i] is calculated considering the initial state of the boxes.
     * @param args
     */
    public static void main(String[] args) {
        //[0,0,1,0,1,1] ==>
        //[cost of moving all balls till index-1] + [total balls, as they need to be moved from i-1 to i]
        /**
         * Left :
         * [0] = 0
         * [1] = 0
         * [2] = 0 , ball++(1)
         * [3] = [0] + 1 = 1
         * [4] = [1] + [1] = 2,  ball++
         * [5] = [2] + [2] = 4
         */

        /**
         * Right:
         * [5] = balls =1
         * [4] = balls++ + [0] =1 , balls(2)
         * [3] = [1] + [2] = 3
         * [2] = [3] + [3 balls] = 6 , balls(3)
         * [1] =
         */
//        int[] input = {0,0,1,0,1,1};
        String boxes = "001011";
        //a[0] = {}
        // a[1] = {}
        int len = boxes.length();
        int[] forward = new int[len];
        int prev = (boxes.charAt(0)=='0'?0:1);
        for(int i=1;i<len;i++){
            forward[i] += forward[i-1]+prev;
            prev += (boxes.charAt(i)=='0'?0:1);
        }
        prev = (boxes.charAt(len-1)=='0'?0:1);
        int[] back = new int[len];
        for(int i=len-2;i>=0;i--){
            back[i] += back[i+1]+prev;
            prev += (boxes.charAt(i)=='0'?0:1);
        }
        int[] op = new int[len];
        for(int i=0;i<len;i++) op[i] = forward[i]+back[i];
        System.out.println(op[0]);
    }
}
