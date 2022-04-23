package gfg.fb;

import java.util.*;

public class SortAnagram {
    public static void main(String[] args) {
        String[] input = new String[]{"cat", "tac","hgd"};

        Map<String, List<Integer>> anagramMap = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            char[] charArray = word.toCharArray();

            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if (anagramMap.containsKey(sortedString)) {
                anagramMap.get(sortedString).add(i);
            } else {
                int finalI = i;
                anagramMap.put(sortedString, new ArrayList<Integer>() {{
                    add(finalI);
                }});
            }
        }

        anagramMap.forEach((key, value) -> {
            System.out.println("word group:");
            value.forEach(i -> System.out.println(input[i]));
        });
    }
}
