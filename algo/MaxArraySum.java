package hackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MaxArraySum {
    public static Map<String, Integer> mem = new HashMap<>();
    public  static Set<Integer> some = new HashSet<>();

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int sum=0;
        int max=0;

        for (int i=0; i < arr.length; i++) {
            for(int j=i+2; j<arr.length; j++) {
                String itr = i +""+ j;
                if(mem.containsKey(itr)) {
                    sum = mem.get(itr);
                    System.out.println("used");
                } else
                    sum = subArr(arr, j, arr[i], itr);
                if(sum>max) {
                    max=sum;
                }
            }
        }
        return max;
    }

    private static int subArr(int[] arr, int index, int sum, String itr) {
        if(index >= arr.length) {
            return sum;
        }
        sum += arr[index];
        mem.put(itr,sum);
        return subArr(arr, index+2, sum, itr+(index + 2));
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }

        int[] arr = {3, 7, 4, 6, 5};


        int res = maxSubsetSum(arr);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();

        System.out.println(res);
    }
}
