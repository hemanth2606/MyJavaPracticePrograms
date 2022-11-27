package leetCode.medium;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        String s1 =s.trim();
        char[] c = s1.toCharArray();
        reverse(c,0,c.length-1);
        reverseWord(c,c.length);
        return Spaces(c,c.length);

    }
    public static void reverseWord(char[] c,int n)
    {
        int i = 0, j = 0;

        while (i < n) {
            while (i < j || i < n && c[i] == ' ') i++; // skip spaces
            while (j < i || j < n && c[j] != ' ') j++; // skip non spaces
            reverse(c, i, j - 1);                      // reverse the word
        }
    }
    public static void reverse(char[] c,int start,int end){
        while (start<=end)
        {
            char T = c[start];
            c[start++] = c[end];
            c[end--] = T;
        }
    }
    static String  Spaces(char[] c, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && c[j] == ' ') j++;             // skip spaces
            while (j < n && c[j] != ' ') c[i++] = c[j++]; // keep non spaces
            while (j < n && c[j] == ' ') j++;             // skip spaces
            if (j < n) c[i++] = ' ';                      // keep only one space
        }
        return new String(c).substring(0,i);
    }
}
