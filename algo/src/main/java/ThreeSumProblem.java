package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> sumIndex = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int low=i+1, high=nums.length-1;
            while(low<high) {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum>0) {
                    high--;
                } else if(sum<0) {
                    low++;
                } else {
                    sumIndex.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                }
            }
        }

        System.out.println(sumIndex);
    }
}
