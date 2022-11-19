package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -2, -1,7};
        System.out.println(max_sum(arr));
    }

    static int max_sum(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int max_ele= arr[0];
        int current_sum=arr[0];
        for(int i = 0 ; i<arr.length;i++)
        {
            current_sum = Math.max(arr[i],arr[i]+current_sum);
            if (max_ele<current_sum)
            {
                max_ele=current_sum;
            }
        }
        return max_ele;
    }

}
