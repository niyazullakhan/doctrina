package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThree {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> sumIndex = new ArrayList<>();
        int sum=-2;

        Arrays.sort(nums);

        // since it is a sum of 3, we need 3 indexes. Consider each index and get best 2 values.. thta can be done using BS
        for(int i=0; i<nums.length; i++) {
            int low=i+1;
            int high = nums.length-1;

            while(low<high) {
                if(nums[i]+nums[low]+nums[high]<sum)
                    low++;

                if(nums[i]+nums[low]+nums[high]>sum)
                    high--;

                else {
                    sumIndex.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    high--;
                    low++;
                }

            }
        }

        System.out.println(sumIndex);

    }
}
