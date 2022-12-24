package leetCode.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class HappyNum {
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        System.out.println(isHappy(19));


    }
    public static boolean isHappy(int n) {

        if (set.contains(n))
        {
            return false;
        }
        else {
            set.add(n);
        }
        if (n==1)
        {
            return true;
        }
        else {
            int rem = 0;
            int sum = 0;
            for (int i = 0; n>0; i++) {
                rem = n%10;
                sum = sum+rem*rem;
                n=n/10;

            }
            return isHappy(sum);
        }
    }
}
