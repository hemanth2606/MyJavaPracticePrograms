package leetCode.easy;

///////question/////////
//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    ///because it takes n!
//    public static int climbStairs(int n) {
//        if(n<2)
//        {
//            return 1;
//        }
//        return climbStairs(n-1)+climbStairs(n-2);
//
//    }
    public static int climbStairs(int n) {
        int ans = 0;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 3;
        }
        if(n==0){
            return 0;
        }
        int pre1 = 2;
        int pre2 = 3;
        for (int i = 3; i < n; i++) {
            ans = pre1+pre2;
            pre1=pre2;
            pre2=ans;
        }
        return ans;
    }
}
