package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        List<Integer> l =  new ArrayList<>();
        l.add(32);
        l.add(43);
        l.add(66);
        System.out.println(l);
        List<Integer> v = new Vector<>();
        v.add(44);
        v.add(11);
        v.add(55);
        System.out.println(v);
    }

}
