package leetCode.medium;

import java.util.ArrayList;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr,3));

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
}
