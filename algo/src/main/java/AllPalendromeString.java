package string;

import java.util.HashSet;
import java.util.Set;

public class AllPalendromeString {
    static Set<String> pal = new HashSet<>();
    static String input = "abaaa";
    public static void main(String[] args) {

        char[] inputChar = input.toCharArray();

        pal.add(String.valueOf(inputChar[0]));
        for(int i=1; i<inputChar.length; i++) {
            pal.add(String.valueOf(inputChar[i]));
           findPal(inputChar, i-1, i);
           findPal(inputChar, i-1, i+1);
        }

        System.out.println(pal);
    }

    private static void findPal(char[] inputChar, int s, int e) {
        while(s>=0 && e<=inputChar.length-1) {
            if(inputChar[s]!=inputChar[e]) {
                break;
            } else {
                pal.add(input.substring(s, e+1));
                s--;e++;
            }

        }
    }
}
