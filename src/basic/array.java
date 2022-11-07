package basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        String[] arr = new String[3];
          Scanner in = new Scanner(System.in);
        arr[0] = "Hello";
        arr[1] = "world";
        for(int i= 0; i<arr.length;i++)
        {
            arr[i] = in.next();
        }
      System.out.println(Arrays.toString(arr));
        int[][]  arr1 = new int[3][3];
        for(int i  = 0 ; i<arr1.length;i++){
            for(int j = 0; j <arr1[i].length;j++){
                arr1[i][j] = in.nextInt();
            }
        }
        for (int[] ints : arr1) {
            System.out.println(Arrays.toString(ints));
        }
//        int[] arr = {1,2,3,4,5};

//        swap(arr,3,4);
//        System.out.println(Arrays.toString(arr));
//        reverse(arr);
//        for (int arr1:arr) {
//            System.out.print(arr1+" ");
//
//        }


    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        swap(arr,start,end);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp;
        temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
