import java.util.HashMap;
import java.util.Map;

public class FindPairOfArrayWithSum {
    public static void main(String[] args) {
        int i = numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
        System.out.println(i);
    }

    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int t : time) {
            if(t % 60 == 0)
                count += map.getOrDefault(0, 0);
            else
                count += map.getOrDefault(60 - t % 60, 0);
            map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
        }
        return count;
    }
}
