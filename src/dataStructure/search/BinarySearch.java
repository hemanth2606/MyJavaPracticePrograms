package dataStructure.search;

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result = binary_search_rec(arr ,10,0,arr.length);
        int result2 = binary_search(arr,10);
        System.out.println(result2);
        System.out.println(result);
        ArrayList<Integer>  l = new ArrayList<>();
        ArrayList<Integer>  l1 = new ArrayList<>();
        l.add(32);
        l.add(22);
        l.add(11);
        l.add(32);
        l.add(22);
        l.add(11);
        //l1.addAll(l.subList(0,3));
        //System.out.println(l1.);
        System.out.println(l.get(5));


    }
    static int binary_search(int[] arr,int target){
        int start  = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc)
            {
                if (arr[mid] > target) {
                    end = mid - 1;

                } else if(arr[mid] < target){
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] < target) {
                    end = mid - 1;

                } else if(arr[mid] > target){
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    static int binary_search_rec(int[] arr,int target,int start,int end){
        if (start<=end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid]==target)
            {
                return mid;
            }
            else if (arr[mid]<target)
            {
                return binary_search_rec(arr,target,mid+1, arr.length);
            }
            else
            {
                return binary_search_rec(arr, target, start, mid-1);
            }
        }
        return -1;
    }

}
