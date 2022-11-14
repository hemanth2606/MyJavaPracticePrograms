package leetCode.easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        Integer s =1534236469;


    }
    public static int lengthOfLastWord(String s) {
       String s1 = s.trim();
       int f = 1232133;
       long f1 = f;

       String[] s2 = s1.split(" ");
       int count = 0;
        for (int i = 0;i<s2[s2.length-1].length();i++) {
            count++;
        }
        return count;

    }
}
