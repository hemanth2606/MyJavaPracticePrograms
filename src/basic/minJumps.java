package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class minJumps {
    public static void main(String[] args) {
        int[] arr= {1,2,5,2};
        String s = "Hemanth gowda KS";
        ArrayList<String[]> a = new ArrayList<>();
        a.add(s.split(" ",2));
        System.out.println(Arrays.toString(a.get(0)));
        System.out.println(Add(3,5));

        //System.out.println(min_jumps());
    }
    static int Add(int x, int y)
    {
        // Iterate till there is no carry
        while (y != 0)
        {
            // carry now contains common
            // set bits of x and y
            int carry = x & y;

            // Sum of bits of x and
            // y where at least one
            // of the bits is not set
            x = x ^ y;

            // Carry is shifted by
            // one so that adding it
            // to x gives the required sum
            y = carry << 1;
        }
        return x;
    }
}
