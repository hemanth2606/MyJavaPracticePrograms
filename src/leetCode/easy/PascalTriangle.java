package leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args)
    {
        System.out.println(generate(0));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (numRows<=0){
            return list;
        }
            for (int i = 0; i < numRows; i++)
            {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < i+1; j++)
                {
                    if (j==0||j==i)
                    {
                        row.add(1);
                    }
                    else
                    {
                        row.add(list.get(i-1).get(j-1)+ list.get(i-1).get(j));
                    }
                }
              list.add(row);
            }
            return list;
    }
}
