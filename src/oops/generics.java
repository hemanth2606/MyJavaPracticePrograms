package oops;

import java.util.ArrayList;

public class generics implements GenericInterface<Integer>{

    @Override
    public void display(Integer value) {
        System.out.println("Hello generics");
    }
}
