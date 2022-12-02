package leetCode.medium;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args){
        String str = "sadbsada";
        String str1 = "sada";
        //System.out.println(str.substring(2,3));
        System.out.println(strStr(str,str1));

    }
    public static int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
