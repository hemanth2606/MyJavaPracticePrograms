package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String s = "Hemi";
        String s1 = "Cool";
        s = "hemi";
        System.out.println(s1.equalsIgnoreCase(s));
        float a = 4.5565655f;
        System.out.printf("my float no is %.2f",a);
        System.out.printf("Pie value: %.2f\n", Math.PI);
        System.out.printf("My name is %s and i am %s \n",s,s1);
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'-3));
        System.out.println(("a"+1));
        System.out.println("Hello"+ new ArrayList<>());
        System.out.println("Hello "+ new Integer(56));
        System.out.println(new Integer(4) +""+new ArrayList<>());
        String series ="";
        for (int i = 0;i<26;i++)
        {
            char ch = (char)('!'+i);
            series = series + ch;
        }
        System.out.println(Arrays.toString(series.toCharArray()));
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ;i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch;
            builder.append(ch);
        }
        System.out.println(builder);
        String name = "Hey there how are u ";
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(isPalindrome("nithins"));
    }
    static boolean isPalindrome(String s){
        if (s == null || s.length()==0)
        {
            return true;
        }
        for (int i = 0;i<s.length()/2;i++)
        {
            char start  = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if (start != end)
            {
                return false;
            }
        }
        return true;
    }
}
