package basic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(43);
        list.add(43);
        list.add(43);
        list.add(43);
        list.add(43);
        list.add(65);
        list.add(43);
        list.set(0,34);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(56);
        System.out.println(list.remove(0));
        System.out.println(list.get(7));
        System.out.print(list);
        //System.out.println(list.clone());
    }
}
