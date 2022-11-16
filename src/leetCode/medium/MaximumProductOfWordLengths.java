package leetCode.medium;

import java.util.ArrayList;
import java.util.Map;

public class MaximumProductOfWordLengths {
    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct(words));
        System.out.println(1<<('b'-'a'));

    }
    public static int maxProduct(String[] words) {
        int size = words.length;
        int[] masks = new int[size];

        for (int i=0; i<size; i++)
            for (char c: words[i].toCharArray())
                masks[i] |= (1 << (c - 'a'));

        int large = 0;
        for (int i=0; i<size-1; i++)
            for (int j=i+1; j<size; j++)
                if ((masks[i] & masks[j]) == 0)
                    large = Math.max(large, words[i].length() * words[j].length());

        return large;

    }

}
