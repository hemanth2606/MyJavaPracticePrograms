package basic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
        System.out.println(addBinary("11","1"));
        System.out.println(2>1);
    }
    public static int mySqrt(int x) {
        int y = (int) Math.sqrt(x);
        return y;
    }
    public static String addBinary(String a, String b) {
        int A = Integer.parseInt(a,2);
        int B = Integer.parseInt(b,2);
        int c =A+B;
        return Integer.toBinaryString(c);

    }
}