package leetCode.medium;
/////question/////////////
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//        If target is not found in the array, return [-1, -1].
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//
//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]
//        Example 2:
//
//        Input: nums = [5,7,7,8,8,10], target = 6
//        Output: [-1,-1]
//        Example 3:
//
//        Input: nums = [], target = 0
//        Output: [-1,-1]

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr =  {5,7,7,8,8,10};
        System.out.println(bs(arr,8));
        System.out.println(Arrays.toString(searchRange(arr,8)));

    }
    public static int[] searchRange(int[] nums, int target) {
        if (bs(nums,target)>=0)
        {
            int i =bs(nums,target);
            int j=bs(nums,target);
            while (i>=0&&nums[i]==target)
            {
                i--;
            }
            while (j>=0&&j<nums.length&&nums[j]==target)
            {
                j++;
            }
            return new int[] {i+1,j-1};
        }
        return new int[]{-1,-1};

    }
    static int bs(int[] nums,int target)
    {
        int start = 0;
        int end = nums.length-1;
        while (start<=end)
        {
            int mid = start + (end - start) / 2;
            if (nums[mid]<target)
            {
                start = mid+1;
            }
            else if (nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
