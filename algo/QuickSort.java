package sort;

/**
 * Divide and conquer strategy to sort a given array
 * 1) identify a pivot element, in this exmaple the pivot is last element in the array
 * 2) rearrange the array such the elements less than pivot are left side of the Pivit position and elements hisgher in valiue are right of the pivot
 * 3) indexes used
 *  3.a) J will start from -1
 *  3.b) i will start from 0
 * 4) if a[j]<=pivot element then,
 *  4.a) do nothings, just move the j index
 *  4.b) else, swap a[i] and a[j]
 * 5) doing this will achieve the 2nd point
 * 6) recursively call the left and right part to the same function
 */
public class QuickSort {

    private void quickSort(int[] input, int startIndex, int lastIndex) {
        if (startIndex<lastIndex) {
            int p = partition(input, startIndex, lastIndex);

            quickSort(input, startIndex, p-1);
            quickSort(input, p+1, lastIndex);
        }
    }

    private int partition(int[] input, int startIndex, int lastIndex) {
        int pivot = input[lastIndex];
        int low=startIndex-1;
        for(int i = startIndex; i<=lastIndex; i++) {
            if(input[i] < pivot) {
                low++;


                int temp = input[i];
                input[i] = input[low];
                input[low] = temp;
            }
        }

        int temp = input[lastIndex];
        input[lastIndex] = input[low+1];
        input[low+1] = temp;

        return low+1;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] input = {5,3,1,10,4,20};
        quickSort.quickSort(input, 0, input.length-1);

        for (int element: input) {
            System.out.println(element);
        }
    }
}
