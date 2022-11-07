package dataStructure.search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "hemanth";
        String s1  = "neelesh";

        int result = linearSearch(s,s1);
        System.out.println(result);
        
    }
//    static int linearSearch(int target,int ...arr){
//        if(arr.length == 0 )
//        {
//            return -1;
//        }
//        for(int i = 0;i<arr.length;i++)
//        {
//            if(arr[i]==target)
//            {
//                return i;
//            }
//        }
//        return Integer.MAX_VALUE;
//    }
    static int linearSearch(String arr,String arr1)
    {
        int st = 0;
        int st2 = 0;
        int max;
        if(arr.length() == 0 && arr1.length() == 0)
        {
            return 0;
        }
        for (char ch:arr.toCharArray())
        {
            st+=ch-96;
        }
        for (char ch2:arr1.toCharArray())
        {
            st2+=ch2-96;
        }
        max = Math.max(st,st2);
        return max;
    }
}
