package leetCode.medium;

import java.util.Arrays;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",4));
        StringBuilder str  = new StringBuilder("kutfjgfyrd");

        str.deleteCharAt(0);
        System.out.println(str);
    }
    public static String convert(String s, int numRows) {
        Character[][] str = new Character[numRows][numRows+2];
        int k =0;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < s.length(); j++) {
                str[k][i] = s.charAt(j);
                if (k>numRows)
                {
                    k++;
                }

            }
        }
        for (Character[] c: str) {
            System.out.println(Arrays.toString(c));

        }
        return "";
    }

}
