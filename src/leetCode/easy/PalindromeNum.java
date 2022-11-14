package leetCode.easy;

public class PalindromeNum {
    public static void main(String[] args) {
        int x =-121;
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x) {
        int y = x;
        int ans = 0;
        while(y!=0)
        {
            int rem = y%10;
            ans = ans*10+rem;
            y = y/10;
        }
        ans = Math.abs(ans);
        if(ans == x)
        {
            System.out.println(ans);
            return true;
        }

        return false;
    }
}
