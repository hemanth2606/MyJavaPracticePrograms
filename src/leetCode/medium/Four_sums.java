package leetCode.medium;

import java.util.*;
import java.util.stream.Collectors;

import static leetCode.medium.ReverseWord.reverseWords;

public class Four_sums {
    public static void main(String[] args)
    {
        int[] arr = {-5,5,4,-3,0,0,4,-2};
        int target = 4;
        System.out.println(fourSum(arr,target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i <nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    for (int k = 0; k < j; k++) {
                        for (int l = 0; l < k; l++) {
                            if (nums[i]+nums[j]+nums[k]+nums[l]==target)
                            {
                                if (list.contains(Arrays.asList(nums[i],nums[j],nums[k],nums[l]))){
                                    continue;}
                                list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                            }
                        }
                    }
                }
            }
        return list;
    }
}
