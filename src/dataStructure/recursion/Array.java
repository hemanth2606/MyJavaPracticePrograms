package dataStructure.recursion;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6};
//        System.out.println(isSort(arr,0));
//        //System.out.println(linearSearch(arr,7,0,new ArrayList<>()));
//        System.out.println(linearSearch1(arr,7,0));
        System.out.println(RBS(arr,7,0,arr.length-1));
    }
    static boolean isSort(int[] arr,int index)
    {
        if (index == arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && isSort(arr,index+1);
    }
  static ArrayList<Integer> linearSearch(int[] arr, int target, int index, ArrayList<Integer> list)
  {
      if (index == arr.length)
      {
          return list;
      }
      if (arr[index]==target)
      {
          list.add(index);
      }
      return linearSearch(arr,target,index+1,list);
  }
    static ArrayList<Integer> linearSearch1(int[] arr, int target, int index)
    {
        ArrayList<Integer> list1  = new ArrayList<>();
        if (index == arr.length)
        {
            return list1;
        }
        if (arr[index]==target)
        {
            list1.add(index);
        }
        ArrayList<Integer> addAllArrayList= linearSearch1(arr,target,index+1);
       list1.addAll(addAllArrayList);
       return list1;
    }
    static int RBS(int[] arr,int target,int start,int end)
    {
        if (start > end) {
            return -1;
        }
        int mid = start+(end-start)/2;
        if (arr[mid]==target)
        {
            return mid;
        }
        if (arr[start]<=arr[mid])
        {
            if (target>=arr[start]&&target<=arr[mid])
            {
                return RBS(arr,target,start,mid-1);
            }
            else {
                return RBS(arr,target,mid+1,end);
            }
        }
        if (target>=arr[mid]&&target<=arr[end]){
            return RBS(arr,target,mid+1,end);
        }
        return RBS(arr,target,start,mid-1);

    }

}
