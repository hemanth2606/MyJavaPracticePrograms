package basic;

import java.util.Scanner;

public class LoopsAndCondition {
    public static void main(String[] args) {
//        int salary  = 25000;
//        if(salary > 100){
//            System.out.println("salary is greater");
//        }
//        else if (salary<100){
//            System.out.println("Salary is lesser");
//        }else {
//            System.out.println("Salary is better");
//        }
//
       Scanner input  = new Scanner(System.in);
//
//        for (int  i= 1 ; i <= 4 ; i++){
//            int n = input.nextInt();
//            System.out.println(n);
//        }
//        int x =5;
//        do{
//            System.out.println("Hello world");
//
//        }while (x != 5);
//        int a=1,b=5;
//        int max = Math.max(a,b);
//        System.out.println(max);
//        char ch = input.next().trim().charAt(0);
//        if (ch>='a' && ch <='z')
//        {
//            System.out.println("Lowercase");
//        }
//        else {
//            System.out.println("UpperCase");
//        }
//        int num  = 12334343;
//        int count  = 0;
//        while (num>0) {
//            int rem = num % 10;
//            if (rem == 3) {
//                count++;
//            }
//            num /= 10;
//        }
//        System.out.println(count);
        int num = 12345;
        int ans = 0;
        while (num>0){
            int rem  = num%10;
            ans = ans * 10+rem;
            num/=10;
        }
        System.out.println(ans);
    }

}
