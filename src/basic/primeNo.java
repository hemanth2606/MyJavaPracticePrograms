package basic;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean result = prime(n);
        System.out.println(result);

    }
    static  private boolean prime(int n) {
        int c = 2;
        if (n<=1){
            return false;
        }
        while (c*c<=n)
        {
            if(n%c == 0){
                return false;
            }
            c++;

        }
        return c*c >n;
    }
}
