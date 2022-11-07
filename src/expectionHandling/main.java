package expectionHandling;

public class main {
    public static void main(String[] args) {
        int a  = 5;
        int b = 0;
        try {
            System.out.println(divide(a,b));

            String name  = "H";
            if (name.equals("H"))
            {
                throw new MyException("my name is correct");
            }
            throw new Exception("just for fun");
        }
        catch (MyException e)
        {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("this wil always execute");
        }
    }
    static int divide(int a , int b) throws ArithmeticException{
        if (b==0)
        {
            throw new ArithmeticException("do not divide by zero");
        }
        return a/b;
    }
}
