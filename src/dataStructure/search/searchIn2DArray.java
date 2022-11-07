package dataStructure.search;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] twoDArr = {{12,3,5,43},{32,65,32,91},{2,4,2,1}};
        int[] twoD = search(twoDArr,32);
        System.out.println(Arrays.toString(twoD));
        int max = max(twoDArr);
        System.out.println(max);
    }

    private static int[] search(int[][] twoDArr, int target)
    {
        for (int i = 0 ;i< twoDArr.length;i++){
            for (int j = 0;j<twoDArr[i].length;j++)
            {
                if (twoDArr[i][j]==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    private static int max(int[][] twoDArr)
    {
        int max = Integer.MIN_VALUE;
        if(twoDArr.length==0){return -1;}
        for (int[] i : twoDArr){
            for (int j : i)
            {
                if (j>max)
                {
                    max = j;
                }
            }
        }
        return max;
    }
}
