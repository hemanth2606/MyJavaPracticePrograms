package leetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSums {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,5,5,7,8,9};
        int target = 6;
        int[] ans = twoSum(arr,target);
        int[] ans1 = findTwoSum(ans,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i =0;i<nums.length;i++)
        {
            for(int j =i+1;j<nums.length;j++)
            {
                if(target==nums[i]+nums[j])
                {
                    return new int[]{i,j};
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
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
