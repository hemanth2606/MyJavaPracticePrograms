package dataStructure.recursion;
public class basic {
    static int sum = 0;
    public static void main(String[] args) {
        System.out.println(fact(10));
//        System.out.println(sum(5));
//        System.out.println(sum1(1235));
//        System.out.println(product(12345));
//        reverse(12345);
//        System.out.println(sum);
//        System.out.println(reverse1(12345));
//        System.out.println(palin(12521));
//        System.out.println(countZeroes(100020000));
//        System.out.println(countZeroes1(100020000));
//        System.out.println(noOfSteps(8));
    }
    static void fun(int n){
        if (n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    static int fact(int n){
        if (n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if (n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
    static int sum1(int n){
        if (n<=1){
            return 1;
        }
        return n%10 + sum1(n/10);
    }
    static int product(int n){
        if (n%10==n){
            return n;
        }
        return n%10 * product(n/10);
    }
    static void reverse(int n){

        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }
    static int reverse1(int n){
       int digit= (int) Math.log10(n)+1;
       return helperRev(n,digit);
    }

    private static int helperRev(int n, int digit) {
        if (n%10==n)
        {
            return n;
        }
        int rem = n%10;
        return rem *(int)Math.pow(10,digit-1) +helperRev(n/10,digit-1);
    }
    static boolean palin(int n){
        if(n==reverse1(n)){
            return true;
        }
        return false;
    }
    static int countZeroes(int n)
    {
        int range = (int)Math.log10(n)+1;
        int count = 0;
        for (int i = 0; i < range; i++) {
            int rem = n%10;
            if (rem==0)
            {
                count++;
            }
            n = n/10;
        }
        return count;
    }
    static int countZeroes1(int n)
    {
        return helperCount(n,0);
    }
    static int helperCount(int n , int count)
    {
        if (n==0)
        {
            return count;
        }
        int rem = n%10;
        if (rem==0)
        {
            return helperCount(n/10,count+1);
        }
        return helperCount(n/10,count);
    }
    static int noOfSteps(int n){
        return helperNoOfSteps(n,0);
    }

    private static int helperNoOfSteps(int n, int count) {
        if(n<=0)
        {
         return count;
        }
        if(n%2==0)
        {
            return helperNoOfSteps(n/2,count+1);
        }
        return helperNoOfSteps(n-1,count+1);
    }

}
