public class ContainerWithMostWater {
    /***
     * Given n non-negative integers a_1, a_2, ..., a_n
     * where each represents a point at coordinate (i, a_i)       .
     * ‘ n ‘ vertical lines are drawn such that the two endpoints of line i is at (i, a_i) and (i, 0)       .
     * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
     * The program should return an integer which corresponds to the maximum area of water that can be contained (maximum area instead of maximum volume sounds weird but this is the 2D plane we are working with for simplicity).
     */


    public static void main(String[] args) {
        int[] input = new int[] {1,8,6,2,5,4,8,3,7};

        int capacity=0;
        int beginning =0;
        int end=input.length-1;

        while(beginning<end) {
            int currentCapacity = Math.min(input[beginning], input[end]) * (end - beginning);

            if(currentCapacity>capacity) {
                capacity=currentCapacity;
            }

            if(input[beginning]<input[end]) {
                beginning++;
            } else end--;
        }

        System.out.println("the capacity is: "+capacity);
    }
}
