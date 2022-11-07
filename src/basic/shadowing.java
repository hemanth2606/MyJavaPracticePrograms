package basic;

public class shadowing {
    static  int a  =19;
    public static void main(String[] args) {
        System.out.println(a);
        int a=1;
        System.out.println(a);
        a = 2;
        shadowing.a = 10;
        print();

    }

    private static void print() {
        System.out.println(a);
    }
}
