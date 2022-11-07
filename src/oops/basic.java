package oops;

import javax.print.DocFlavor;
import java.util.*;

public class basic {
    static {
        // will only runs once ,when the first obj is created i,e, when the class is load for the first time
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
//        map.put(2,1);
//        int[] arr = {32,32,1,2,2,3,4,2,12,12,32,32};
//        System.out.println(map.containsKey(2));
//        System.out.println(duplicates(arr, arr.length));
//        Student s = new Student();
//        System.out.println(s.rollNo);
        singleton singletons;
        singletons = singleton.getInstance();
        ArrayList<String> a = new ArrayList<>();
        a.add("h");
        a.add("e");
        a.add("a");a.add("n");a.add("t");a.add("h");a.add("k");a.add("s");
        System.out.println(a);

    }

    //    public static ArrayList<Integer> duplicates(int arr[], int n) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            if (map.containsKey(arr[i])) {
//                map.replace(arr[i],map.get(arr[i])+1);
//            }
//            else {
//                map.put(arr[i],1);
//            }
//        }System.out.println(map);
//        for (Integer a: map.keySet()) {
//            if (map.get(a)>=2)
//            {
//                list.add(a);
//            }
//         }
//        Collections.sort(list);
//      return list;
//    }
static class Student{
    int rollNo;
    String[] name;
    int[] s;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }
    public Student(){
        this(32);
    }


}
}
