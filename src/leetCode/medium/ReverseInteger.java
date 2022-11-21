package leetCode.medium;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));

    }
    public static int reverse(int x) {
        int ans_1 = 0;
        int ans = 0;
        while (x!=0){
            int rem = x%10;
            ans =ans*10+rem;
            x/=10;
            if ((ans - rem) / 10 != ans_1)
            { return 0; }
            ans_1=ans;
        }
        return ans_1;
    }
}
