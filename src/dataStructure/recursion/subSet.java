package dataStructure.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        String s0 = "abc";
        skipString("",s0);
        System.out.println(skipString1(s0));
        System.out.println(skipApple("Appleisgoodforhealth"));
        System.out.println(skipAppNotApple("appleisappgoodforhealth"));
        returnSubSet("",s0);
        System.out.println(returnSubSet1("",s0));
        int[] num = {1,2,2};
        System.out.println(subsetInt(num));
        System.out.println(subsetIntDuplicate(num));

    }

    private static void skipString(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skipString(p, up.substring(1));
        }
        else {skipString(p+ch,up.substring(1));}

    }
    private static String skipString1(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipString1(up.substring(1));
        }
        else {return ch+skipString1(up.substring(1));}
    }
    private static String skipApple(String s){
        if (s.isEmpty()){
            return "";
        }
        if (s.startsWith("Apple"))
        {
            return skipApple(s.substring(5));
        }
        return s.charAt(0) + skipApple(s.substring(1));
    }
    private static String skipAppNotApple(String s){
        if (s.isEmpty()){
            return "";
        }
        if (s.startsWith("app")&&!s.startsWith("apple"))
        {
            return skipAppNotApple(s.substring(3));
        }
        return s.charAt(0) + skipAppNotApple(s.substring(1));
    }
    static void returnSubSet(String p,String up){
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        returnSubSet(p+ch,up.substring(1));
        returnSubSet(p,up.substring(1));
    }
    static ArrayList<String> returnSubSet1(String p, String up){
        if (up.isEmpty())
        {
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = returnSubSet1(p+ch,up.substring(1));
        ArrayList<String> right =returnSubSet1(p,up.substring(1));
        left.addAll(right);
        left.remove("");
        return left;
    }
    static List<List<Integer>> subsetInt(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr) {
            int size = outer.size();
            System.out.println(size);
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        outer.remove(0);
        return outer;

    }
    static List<List<Integer>> subsetIntDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0;i<arr.length;i++) {
            start = 0;
            if (i>0&&arr[i]==arr[i-1])
            {
                start = end+1;
            }
            end=outer.size()-1;
            int size = outer.size();
            System.out.println(size);
            for (int j = start; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        outer.remove(0);
        return outer;

    }
}
