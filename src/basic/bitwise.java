package basic;

import java.util.Arrays;

public class bitwise {
    public static void main(String[] args) {
//        int n  = 13;
//        System.out.println(isOdd(89));
        int[] arr = {1};
        System.out.println(singleDigit(arr));
//         System.out.println(3&-3);
//        System.out.println(magicNo(4 ,2));
//        System.out.println(NoOfDigits(12345,10));
//        System.out.println(sumOfPascalsTriangle(5));
//        System.out.println(PowOfTwo(4));
//        System.out.println(noOfPow(2,2));
//        System.out.println(noOfSetBit(45));
//        System.out.println(Integer.toBinaryString(10));
        System.out.println(xor(6));
        System.out.println(rangeXOR(2,5));
        System.out.println(1%4);
//        int[][] arr1 = {{1,0,0},{0,0,1},{0,1,0}};
//        System.out.println(Arrays.toString(flipAndInvertImage(arr1)));
    }

    private static int singleDigit(int[] arr) {
        int unique =0 ;
        for (int n:arr) {
            unique ^=n;
        }
        return unique;
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
    private static int magicNo(int n,int base)
    {
         int ans = 0;
         while (n>0){
             int last = n&1;
             n = n>>1;
             ans+=last*base;
             base = base*5;
         }
         return ans;
    }
    private static int NoOfDigits(int n,int b){
        int ans = (int)(Math.log(n)/ Math.log(b))+1;
        return ans;
    }
    private static int sumOfPascalsTriangle(int n){
        return 1<<(n-1);
    }
    private static boolean PowOfTwo(int n)
    {
        if(n==0)
        {
            return false;
        }
        return (n&(n-1))==0;
    }
    private static long noOfPow(int power,int base)
    {
        long ans = 1;
        while (power>0){
            if((power&1)==1){
                ans*=base;
            }
            base *= base;
            power = power>>1;

        }
        return ans;
    }
    private static int noOfSetBit(int n)
    {
        int count = 0;
//        while (n>0)
//        {
//            if ((n&1)==1){
//                count++;
//            }
//            n = n>>1;
//        }
        //or
//        while (n>0){
//            count++;
//            n-=(n&(-n));
//
//        }
        while (n>0){
            count++;
            n=(n&(n-1));

        }
        return count;
    }
    static int xor(int n)
    {
        if((n%4)==0)
        {
            return n;
        }
        if((n%4)==1)
        {
            return 1;
        }
        if((n%4)==2)
        {
            return n+1;
        }
        return 0;
    }
    static int rangeXOR(int a,int b){
        int ans = xor(b)^xor(a-1);
        int ans2 = 0;
        for (int i = a ; i <=b ; i++) {
            ans2^=i;
        }
        System.out.println(ans2);
        return ans;

    }
    static  int[][] flipAndInvertImage(int[][] image)
    {
        for (int[] row: image) {
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                int temp = row[i]^1;
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1]= temp;
            }
        }
        return image;
    }


}
