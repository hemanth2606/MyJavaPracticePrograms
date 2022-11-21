package leetCode.medium;

import java.util.regex.Pattern;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("-104193m jhbjhb"));
        System.out.println((int)'9');
    }
    public static int myAtoi(String s) {
        String s1 = s.trim();
        int ans = 0;
        int sign = 1;
        for (char x: s1.toCharArray()) {
            if (x=='+'||x=='-')
            {
            sign = x=='+'?1:-1;
            continue;
           }
            int digit = x-'0';
            if (digit>=0&&digit<=9)
            {
                ans = ans*10+digit;
            }
            else {
                break;
            }
            if(Integer.MAX_VALUE/10 < ans || Integer.MAX_VALUE/10 == ans && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;


        }
        return ans*sign;
    }
}
