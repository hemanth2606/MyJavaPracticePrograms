package leetCode.medium;

public class LongestPalindromicSubstring {
    private static int lo, maxLen;
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));

    }
//    public static String longestPalindrome(String s) {
//        if(s.length()==1){
//            return s;
//        }
//        if (s.isEmpty())
//        {
//            return "";
//        }
//        String sub1 = checkString(s,0,s.length()-1);
//        return sub1;
//    }

//    private static String checkString(String s, int i, int length) {
//        if (i>=length)
//        {
//            return s.substring(i,length);
//        }
//        for (int j = 0; j <length; j++) {
//            if (s.charAt(i)!=s.charAt(length))
//            {
//                return s.substring(i+1,length);
//            }
//            else {
//
//            }
//        }
//        return s.substring(i,length);
//    }
//
//      public static boolean isPalindrome(String s,int start,int end)
//      {
//          while (start>=end)
//          {
//              if (s.charAt(start)==s.charAt(end))
//              {
//                  start++;
//                  end--;
//              }
//              else {
//                  return false;
//              }
//          }
//          return true;
//      }


    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private static void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}
