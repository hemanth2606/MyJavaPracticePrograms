package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args)
    {
/*
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(s);

        //type casting
        int num = (int) 67.88;

        //automatic type promotion in expression
        int a = 257;
        byte b = (byte) a;// 257 % 256  = 1
        System.out.println(num);
        System.out.println(b);
        float cel = input.nextFloat();
        float Fa = cel*(9/5) + 32;
        System.out.println(Fa);
*/
        int[] list= new int[4];
        list[0] = 7;
        list[1] = 3;
        list[2] = 2;
        list[3] = 1;
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        float  f = 4.5f;
        long  l   = 5432L;
        System.out.println(Long.SIZE);





    }
}
