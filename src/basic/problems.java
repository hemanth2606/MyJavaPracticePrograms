package basic;

import java.awt.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problems {
    public static void main(String[] args) {
        String s = "+d+==3+==++n+c+";
        String result = isAdd(s);
        System.out.println(result);
        System.out.println(Integer.parseInt("0111",2));
    }

    private static String isAdd(String s) {
        Pattern pattern =Pattern.compile("[a-z]");
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            Matcher m = pattern.matcher(String.valueOf(s.charAt(i)));
            boolean x = m.matches();
            if (x) {
                if((s.startsWith("+")&&s.endsWith("+")))
                {
                    if(!(s.charAt(i-1)=='+'&&s.charAt(i+1)=='+'))
                    {
                        b = false;
                        break;
                    }
                    else {
                        b=true;
                    }

                }
                else {
                    b=false;
                    break;
                }
            }
        }
        return String.valueOf(b);
    }


}
