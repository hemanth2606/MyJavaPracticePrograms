package leetCode.medium;

import dataStructure.recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,0,2,-4};
        System.out.println(ThreeSum(arr));
        System.out.println(ThreeSum1(arr));

    }
    public static int threeSum(int[] nums,int k) {
        int sum = 0;
        int count =0;
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if (sum==-4){
                    count++;
                }
            }

        }
        return count;
    }
    public static List<List<Integer>> ThreeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (i==0||(i>0&&nums[i]!=nums[i-1]))
            {
                int low =i+1;
                int high = nums.length-1;
                int sum = 0-nums[i];
                while(low<high)
                {
                    if (nums[low]+nums[high]==sum)
                    {
                        list.add(List.of(nums[i],nums[low],nums[high]));
                        while(low<high&&nums[low]==nums[low+1]) low++;
                        while(low<high&&nums[low]==nums[high-1]) high--;
                        low++;
                        high--;
                    } else if (nums[low]+nums[high]>sum) {
                        high--;
                    }
                    else {
                        low++;
                    }
                }

            }

        }
        return list;
    }
    public static List<List<Integer>> ThreeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (list.contains(Arrays.asList(nums[i],nums[j],nums[k])))
                    {
                        continue;
                    }
                    if (nums[i]+nums[j]+nums[k]==0){list.add(Arrays.asList(nums[i],nums[j],nums[k]));}
                }
            }

        }
        return list;

    }
}
