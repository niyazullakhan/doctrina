//package gfg.fb;
//
//import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;
//import com.sun.xml.internal.ws.util.ASCIIUtility;
//
//import java.io.StringReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Decoding {
//    /**
//     * Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence, count the number of possible decodings of the given digit sequence.
//     * Examples:
//     *
//     * Input:  digits[] = "121"
//     * Output: 3
//     * // The possible decodings are "ABA", "AU", "LA"
//     *
//     * Input: digits[] = "1234"
//     * Output: 3
//     * // The possible decodings are "ABCD", "LCD", "AWD"
//     *
//     * 65:A
//     *
//     * 1234
//     * [1]
//     * 1: 234
//     * [1, Sub(234)]
//     * 2:
//     * [1,Sub(234),2, Sub(34)]
//     * 3:
//     * [1,Sub(234),2, Sub(34), 3, Sub(4)]
//     *
//     *
//     * 4:
//     * [1,Sub(234),2, Sub(34), 3, 4]
//     *
//     * 5:
//     * [1,Sub(234),2, Sub(34), 3, 4]
//     */
//
//
//    static List<String> subString = new ArrayList<>();
//    public static void main(String[] args) {
//       String input = "121";
//
//       getSequence(input);
//    }
//
//    private static String getSequence(String input) {
//        if(input.length()==1) {
//            return input;
//        }
//
//        subString.add();
//        return subString.add()
//    }
//}
