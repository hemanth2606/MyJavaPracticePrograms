package leetCode.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeElement(nums));
        System.out.println(Arrays.toString(nums));

    }
    public static int removeElement(int[] nums) {
        int count = 0;
        for (int i = 1; i <nums.length; i++) {
            if (nums[i]!=nums[i-1])
            {
                nums[count++] = nums[i-1];
            }
        }
        nums[count]=nums[nums.length-1];
        return count+1;
    }
}
