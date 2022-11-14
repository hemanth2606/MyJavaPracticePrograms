package leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        long ans = 0;
        for (int i = 0; i < digits.length; i++) {
            ans = ans * 10 + digits[i];
        }
        System.out.println(ans);
        ans+=1;
        System.out.println(ans);
        int[] new_arr = new int[(int)Math.log10(ans)+1];
        long temp = ans;
        int count =new_arr.length-1;
        while (temp != 0)
        {
            long rem = temp%10;
            new_arr[count] =(int)rem;
            temp/=10;
            count--;
        }
        return new_arr;
    }
}
