package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[5];
         int j = in.nextInt();
         int k = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        String[] ch = new String[3];
        ch=in.next().split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(j+" "+k);
        System.out.println(Arrays.toString(ch));



    }
}
