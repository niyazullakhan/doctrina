package search;

/**
 * Binary search follows divide and conquer strategy
 * 1) Input needs to be sorted
 * 2) Log(n) time complexity
 */
public class BinarySearch {
    private int search(int[] inputArray, int key, int startPosition, int lastPosition) {
        if(lastPosition >= startPosition) {
            int mid = startPosition+(lastPosition - startPosition)/2;
            if(key == inputArray[mid])
                return mid;
            else if(key < inputArray[mid])
                return search(inputArray, key, startPosition, mid-1);
            else
                return search(inputArray, key, mid+1, lastPosition);
        }
        return -1;
    }

    //Option2: Another Version of search with lesser space complexity
    private int search(int[] inputArray, int key) {
        int startIndex = 0;
        int lastIndex = inputArray.length;

        while(lastIndex-startIndex > startIndex) {
            int m=startIndex + (lastIndex-startIndex)/2;
            if(key <= inputArray[m])
                lastIndex = m;
            else
                startIndex = m;
        }
        if(key == inputArray[lastIndex])
            return lastIndex;
        else if(key==inputArray[startIndex])
            return startIndex;
        return -1;
    }


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] input = {2, 4, 6, 8, 20};

//        int position = binarySearch.search(input, 0, 0, input.length-1);
        //Option:2
        int position = binarySearch.search(input, 8);
        if (position >= 0)
            System.out.println("found at position: "+position);
        else
            System.out.println("Key not found!!");

    }
}
