package dataStructure.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,9,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for(int i = 0;i<arr.length ; i++)
        {
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = 0;i<=last;i++)
        {
            if (arr[max]<arr[i])
            {
                max=i;
            }
         }
        return max;

    }
}
