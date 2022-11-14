package basic;

import java.util.Arrays;

public class stringBuffer {
    public static void main(String[] args)
    {
//        StringBuffer b = new StringBuffer();
//        b.append("hemanth");
//        b.append(12);
//        b.insert(1,14);
//        b.insert(1,'e');
//        b.replace(3,3,"he");
//        b.delete(2,6);
//        b.reverse();
//        b.ensureCapacity(32);
//        System.out.println(b.substring(2,4));
//        System.out.println(b.length());
//        System.out.println(b.capacity());
//        System.out.println(b);
        int[] arr = {3,22,66,2,3,8,9};
        System.out.println(SecondLargest(arr));
    }
    static String SecondLargest(int[] arr){
        Arrays.sort(arr);
        StringBuffer s = new StringBuffer();
        s.append(arr[1]);
        s.append("X");
        s.append(arr[arr.length-2]);
        s.append("alefagae");
        for (int i =3;i<s.length();i+=3)
        {
            s.replace(i,i,"X");
        }
        return String.valueOf(s);
    }

}
