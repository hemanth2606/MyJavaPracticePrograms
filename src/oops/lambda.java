package oops;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =  0; i<10 ; i++)
        {
            arr.add(i);
        }
        //arr.forEach((item)-> System.out.println(item*2));
        Consumer<Integer> fun =  (a)-> System.out.println(a*3);
        arr.forEach(fun);
        Operator sum = Integer::sum;
        Operator pro = (a,b)->a*b;
        Operator div = (a,b)->a/b;


        lambda lam = new lambda();
        System.out.println(lam.operate(4,3,sum));
        System.out.println( lam.operate(3,2,div));
        System.out.println(lam.operate(5,2,pro));

    }
    private int operate(int a,int b,Operator op)
    {
        return op.operator(a,b);
    }

}
interface Operator
{
    int operator(int a ,int b);
}
