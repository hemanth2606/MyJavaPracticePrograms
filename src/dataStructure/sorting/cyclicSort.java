package dataStructure.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
//        int[] arr1 = {3,2,0};
//        int ms = missingNo(arr1);
//        int[] arr2 = {4,3,2,7,8,2,3,1,11,10,11};
//        int[] arr3 = {4,3,2,7,8,2,3};
//        int[] arr4 = {0,0,1,1,2,2,3,4,5};
//        List<Integer> duplicateArray  = duplicateArray(arr4);
//        System.out.println(duplicateArray);
//        int DA = duplicateNum(arr3);
//        System.out.println(DA);
//        List<Integer> list = missingArray(arr2);
//         System.out.println(list);
//        System.out.println(ms);
//        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correct =arr[i]-1;
            if(arr[i]!= arr[correct])
            {
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    static int missingNo(int[] arr)
    {
        int i =0;
        while (i<arr.length)
        {
            if (arr[i]<arr.length && arr[i]!=arr[arr[i]])
            {
                swap(arr,i,arr[i]);
            }
            else {
                i++;
            }

        }
        for (int index = 0; index<arr.length;index++){
            if(arr[index]!=index)
            {
                return index;
            }

        }
        return arr.length;
    }
    static List<Integer> missingArray(int[] arr)
    {
        int i =0;
        while (i<arr.length)
        {
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1 ){
                list.add(index+1);
            }
            
        }
        return list;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int duplicateNum(int[] arr)
    {
        int i =0;
        while (i<arr.length)
        {
            if (arr[i] != i+1)
            {
                int correct = arr[i]-1;
                if (arr[i]!=arr[correct])
                {
                    swap(arr,i,correct);
                }
                else {
                    return arr[i];
                }
          }
            else {
                i++;
            }
        }
       return -1;
    }
    static List<Integer> duplicateArray(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        int i =0;
        while (i<arr.length)
        {
                int correct = arr[i];
                if (arr[i]!=arr[correct])
                {
                    swap(arr,i,correct);
                }
                else {
                    i++;
                }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index ){
                list.add(arr[index]);
            }

        }
        return list;
    }
    static int[] setMismatch(int[] arr)
    {
        int i =0;
        while (i<arr.length)
        {
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1 ){
                return new int[]{arr[index],index+1};
            }

        }
        return new int[]{-1,-1};
    }
    static int firstMissingNumber(int[] arr)
    {
        int i =0;
        while (i<arr.length)
        {
            int correct =arr[i]-1;
            if (arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }
        for (int index = 0; index<arr.length;index++){
            if(arr[index]!=index)
            {
                return index+1;
            }

        }
        return arr.length+1;
    }
}
