package search;

public class IdentifyPeakElement {

    public static int[] a = new int[10];
    private int ind = 0;

    private void findPeak(int[] input, int startIndex, int lastIndex) {
//        int ind=0;
//        while((lastIndex-startIndex)<lastIndex) {
        int mid = (lastIndex - startIndex) / 2 + startIndex;
        if ((mid == 0 || input[mid-1] <= input[mid]) && (mid == 6 ||
                input[mid+1] <= input[mid])) {
            a[ind++] = input[mid];
            return;
        }

//        if (mid - 1 >= 0 && input[mid] > input[mid - 1])
//            a[ind++] = input[mid];
//        if(mid>0 && input[mid-1] > input[mid])
            findPeak(input, startIndex, mid);
//        else
        findPeak(input, mid, lastIndex);
//        }

    }

    public static void main(String[] args) {
        IdentifyPeakElement peakElement = new IdentifyPeakElement();
        int[] input = {10, 20, 15, 2, 23, 90, 67};
        peakElement.findPeak(input, 0, input.length);
        for (int ele:
             a) {
            System.out.println(ele);

        }
    }
}
