package leetCode.medium;

import java.util.ArrayList;
import java.util.HashMap;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray1(arr));

    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j <nums.length; j++) {
                sum = sum+nums[j];
                if(max<sum)
                {
                    max = sum;
                }
            }

        }
        return max;
    }
    public static int maxSubArray1(int[] nums) {
        int max_ele= Integer.MIN_VALUE;
        int current_sum=0;
        for(int i = 0 ; i<nums.length;i++)
        {
            current_sum = Math.max(nums[i],nums[i]+current_sum);
            if (max_ele<current_sum)
            {
                max_ele=current_sum;
            }
        }
        return max_ele;
    }
}
