package cloning;

import java.util.Arrays;

public class main{


    public static void main(String[] args) throws CloneNotSupportedException{
        Human k = new Human(32,"Hemanth");
        Human twin = (Human)k.clone();
        System.out.println(twin.age+twin. name);
        System.out.println(Arrays.toString(twin.arr));

    }

}
