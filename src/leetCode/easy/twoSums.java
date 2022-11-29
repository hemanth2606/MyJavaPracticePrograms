package leetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSums {
    public static void main(String[] args) {
        int[] arr = {2,4,3,11,15};
        int target = 9;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(findTwoSum(arr,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i =0;i<nums.length;i++)
        {
            for(int j =0;j<i;j++)
            {

                if(target==nums[i]+nums[j])
                {
                    return new int[]{j,i};
                }

            }
        }
        return new int[]{};
    }
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
