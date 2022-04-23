package sort;

public class BubbleSort {

    /**
     * The complexity is O(n^2)
     * @param inputArray
     */
    private void bs(int[] inputArray) {
        for(int i=0; i<inputArray.length-1; i++) {
            for(int j=0; j<inputArray.length-1-i;j++) {
                if(inputArray[j]>inputArray[j+1]) {
                    int temp = inputArray[j];
                    inputArray[j]=inputArray[j+1];
                    inputArray[j+1]=temp;
                }
            }
        }
        for (int ele: inputArray) {
            System.out.println(ele);
        }
    }

    /**
     * Optimised bubble sort for sorted input
     */
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // if the array is sorted there will never be a swap.. hence this flag is useful to maintain
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
        public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        bs.bs(input);
    }
}
