package dataStructure.sorting;

import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.SQLInput;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,6,3,2,1};
//        int[] ans = Sort(arr);
//        System.out.println(Arrays.toString(ans));
//        SortInPlace(arr,0,arr.length );
//        System.out.println(Arrays.toString(arr));
        SortInPlace(arr,0,6);
    }
    static int[] Sort(int[] arr)
    {
       if (arr.length==1)
       {
           return arr;
       }
       int mid = arr.length/2;
       int[] left = Sort(Arrays.copyOfRange(arr,0,mid));
        System.out.println(Arrays.toString(left)+ "the left");
       int[] right = Sort(Arrays.copyOfRange(arr,mid,arr.length));
        System.out.println(Arrays.toString(right)+ "the right");
       return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second) {
        int[] mix= new int[first.length + second.length];
        int i = 0;
        int j =0;
        int k = 0;
        while (i<first.length&&j<second.length)
        {
            if (first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the basic.array is not complete
        //copy the remaining elements
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length)
        {
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    static void SortInPlace(int[] arr,int start,int end)
    {
        if ((end-start)==1)
        {
            return;
        }
        int mid =start+(end-start)/2;
        SortInPlace(arr,start,mid);
        System.out.println(Arrays.toString(arr)+ "the left");
        SortInPlace(arr,mid,end);
        System.out.println(Arrays.toString(arr)+ "the right");
       mergeInPlace(arr,start,mid,end);
        System.out.println(Arrays.toString(arr)+ "the end recs");
    }

    private static void mergeInPlace(int[] arr,int start,int mid,int end) {
        int[] mix= new int[end-start];
        int i = start;
        int j =mid;
        int k = 0;
        while (i<mid&&j<end)
        {
            if (arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the basic.array is not complete
        //copy the remaining elements
        while (i< mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<end)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, start, mix.length);

    }

}
