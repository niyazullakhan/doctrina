package search;

/*
Consider n machines which produce same type of items but at different rate i.e., machine 1 takes a1 sec to produce an item, machine 2 takes a2 sec to produce an item. Given an array which contains the time required by ith machine to produce an item. Considering all machine are working simultaneously, the task is to find minimum time required to produce m items.
Examples:


Input : arr[] = {1, 2, 3}, x = 11
Output : 6
In 6 sec, machine 1 produces 6 items, machine 2 produces 3 items,
and machine 3 produces 2 items. So to produce 11 items minimum
6 sec are required.

Input : arr[] = {5, 6}, m = 11
Output : 30
https://www.geeksforgeeks.org/minimum-time-required-produce-m-items/
 */
public class MinimumTimeToProduce {

    public static void main(String[] args) {
        int[] machine = {1, 2, 3};
        int items = 11;

        // For every ith second, one machine ccan produce i/machine[i] peices.
        // So we just need to parse the time index and do the binary search to findd that one time where the items can be produced.

        int maxVal = gethighestTime(machine);

        int time = getTime(machine, maxVal*items, items);
        System.out.println(time);

    }

    private static int getTime(int[] machine, int high, int items) {
        int low=1;

        while(low<high) {
            int mid = (low+high)/2;

            int possibleItems = computeNumberOfItems(machine, mid);

            if(possibleItems<items) {
                low=mid+1;
            } else
                high=mid;
        }

        return high;
    }

    private static int computeNumberOfItems(int[] machine, int mid) {
        int items=0;
        for(int i=0; i<machine.length; i++) {
            items+=mid/machine[i];
        }
        return items;
    }

    private static int gethighestTime(int[] machine) {
        int max = Integer.MIN_VALUE;
//        int max=0;
        for(int i=0; i<machine.length; i++) {
            max=Math.max(max, machine[i]);
        }
        return max;
    }
}
