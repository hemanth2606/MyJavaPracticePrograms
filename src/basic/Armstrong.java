package basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isArmStrong(n);
        System.out.println(ans);
        for(long i = 100 ; i<1000000000000000000L;i++)
        {
            if(isArmStrong(i))
            {
                System.out.println(i+"  ");
            }
        }
    }
    private static boolean isArmStrong(long n) {
        long sum = 0;
        long o = n;
        while (n > 0) {
            long rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }
        return sum == o;
    }
}
