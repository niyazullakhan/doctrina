import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 */
public class SubArraySumEqualK {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,2,1,10,4,5};
        int k=5;
        //{4,5,7,8,18,22,27}
//        {5},
        /*
        {3,1}
        {4,1}
        {5,1} --> c++
        {7,1}
        {}
         */

//        int sum=5;
//
//        for(int i=0; i<inputArr.length-2;i++) {
//            inputArr[i]+=inputArr[i+1];
//        }
//        inputArr[inputArr.length-1]=0;
//
//        for(int i=0; i<inputArr.length-2;i++) {
//
//        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            if (sum == k)
                count++;

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}
