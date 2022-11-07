package basic;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class DAAMath {
    public static void main(String[] args) {
        //System.out.println(isPrime(17));
        int n = 1000;
//        Map<Integer,Integer> map = new LinkedHashMap<>();
//        boolean[] arr = new boolean[n+1];
//        sieve(n,arr);
        System.out.println(sqrt(9,5));
//        System.out.println(NewtonSQRT(4));
//        factors(20);
//        factors1(20);
//        factors2(20);
//        System.out.println(gcd(224,105));
//        System.out.println(lcm(224,105));


    }

    private static boolean isPrime(int n) {
        if (n<=1){
            return false;

        }
        int c=2;
        while (c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return true;
    }
    static void sieve(int n,boolean[] primes)
    {
        for (int i = 2; i*i <= n; i++) {
            if(!primes[i])
            {
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;

                }
            }

        }

        for (int i = 2; i <=n ; i++) {
            if (!primes[i])
            {
                System.out.print(i+" ");
            }

        }
    }
    static double sqrt(int n ,int p)
    {
        int s =0;
        int e = n;
        double root = 0.0;
        while (s<=e){
            int m =s+(e-s)/2;

            if (m*m==n)
            {
                return m;
            }

            if(m*m>n){
                e = m-1;
            }

            else
            {
                s=m+1;
            }
        }
        double inc= 0.1;
        for (int i = 0; i < p ; i++) {
            while (root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }

        return root;
    }
    static double NewtonSQRT(double n)
    {
        double x=n;
        double root;
        while (true)
        {
             root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<.00000001){
                break;

            }
            x = root;
        }
        return root;
    }
    static void factors(int n){
        for (int i = 1; i <=n ; i++) {
            if (n%i==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    static void factors1(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i==i)
                {
                    System.out.print(i+" ");
                }
                System.out.print(i + " "+n/i+" ");
            }

        }
        System.out.println();
    }
    static void factors2(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i==i)
                {
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }

            }

        }
        for (int j =  list.size()-1; j >=0; j--) {
            System.out.print(list.get(j)+" ");

        }
        System.out.println();
    }
    static int gcd(int a , int b){
        if (a==0)
        {
            return b;
        }
        return gcd(b%a,a);

    }
    static int lcm(int a,int b){
        if (a==0)
        {
            return b;
        }
        return (a*b)/gcd(a,b);

    }
}
