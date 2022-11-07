package dataStructure.search;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTwoD {
    public static void main(String[] args)
    {
        int[][] arr =  {{1,3,4},{2,9,10},{15,16,17}};
        int[] result = two_d(arr,17);
        System.out.println(Arrays.toString(result));
        int[][] arr1 =  {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int[] result1 = binary_two_d(arr1,10);
        System.out.println(Arrays.toString(result1));
    }
    static int[] two_d(int[][] arr, int target){
        int r = 0;
        int c = arr.length -1 ;
        while (r<arr.length&&c>=0)
        {
            if(arr[r][c]==target)
            {
                return new int[] {r,c};

            }
            else if (arr[r][c]<target ) {
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] binarySearch(int[][] arr, int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd)
        {
            int mid = cStart+(cEnd -cStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<target){
                cStart = mid +1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};

    }
    static int[] binary_two_d(int[][] arr , int target){
        int rows = arr.length;
        int cols = arr[0].length;

        //this is the edge case
        if(rows ==1){
            return binarySearch(arr,0,0,cols-1,target);
        }
        //run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols /2;
        while (rStart<(rEnd-1))
        {
            int mid = rStart + (rEnd-rStart)/2;
            if (arr[mid][cMid]==target)
            {
                return new int[]{mid,cMid};
            }
            if (arr[mid][cMid]<target)
            {
                rStart = mid;
            }
            else {
                rEnd = mid;
            }

        }
        //now we have two rows
        //check whether the target is in the col of 2 row
        if (arr[rStart][cMid]==target)
        {
            return new int[]{rStart,cMid};

        }
        if (arr[rStart+1][cMid]==target)
        {
            return new int[]{rStart+1,cMid};
        }

        //search for the first half
        if(target<=arr[rStart][cMid-1])
        {
            return binarySearch(arr,rStart,0,cMid-1,target);

        }
        //search for the second half
        if(target>=arr[rStart][cMid+1]&&target<=arr[rStart][cols-1])
        {
            return binarySearch(arr,rStart,cMid+1,cols-1,target);
        }
        //search for the third half
        if(target<=arr[rStart+1][cMid-1])
        {
            return binarySearch(arr,rStart+1,0,cMid-1,target);

        }
        //search for the fourth half
        if(target>=arr[rStart][cMid-1])
        {
            return binarySearch(arr,rStart+1,cMid+1,cols-1,target);

        }
        return new int[]{-1,-1};
    }
}
