package hackerRank;

import com.sun.tools.javac.util.StringUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagrams {
    int sherlockAndAnagrams(String s) {
        List<String> ang = new ArrayList();
        s=s.trim();
        for(int i=0; i<=s.length()-1; i++) {
            for(int j=i+1; j<=s.length(); j++) {
                ang.add(s.substring(i,j));
            }
        }

        int angCount =0;
        Map<Integer, Integer> val = ang.stream()
                .map(a -> Arrays.stream(intArray(a.toCharArray())).sum())
                .collect(Collectors.toMap(Function.identity(), (o) -> 0, (o,n) -> n+1));

        for(int v : val.keySet()) {
            if(v!=0 && val.get(v) > 0)
                angCount+=1;
        }

        List<Integer> some = new ArrayList<>();


        return angCount;



//        List<Integer> strVal = ang.stream()
//                .map(a -> Arrays.asList(a.toCharArray()).stream().map(x -> (int)x))
//                .map(a -> {
//            return Arrays.stream(a.toCharArray())
//                    .mapToInt(Integer::intValue)
//                    .sum();
//        }).collect(Collectors.toList());
//


    }

    private int[] intArray(char[] input) {
        int[] intArray = new int[input.length];
        for(int i=0; i<input.length; i++) {
            intArray[i] = input[i];
        }
        return intArray;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Anagrams s1 = new Anagrams();
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int qItr = 0; qItr < q; qItr++) {
//            String s = scanner.nextLine();

            int result = s1.sherlockAndAnagrams("1221");
        System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();

//        scanner.close();

    }



}
