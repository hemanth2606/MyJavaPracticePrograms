package basic;

public class minLinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,4,9};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int ans = arr[0];
        for (int i : arr) {
            if (i < ans) {
                ans = i;
            }
        }
        return ans;
    }
}
