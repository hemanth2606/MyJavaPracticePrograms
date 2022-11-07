package dataStructure.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class CountingSort {
    public static void main(String[] args) {
        char[] arrChar ={ 'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's' };
        int len = arrChar.length;
        sortAb(arrChar,len);
        int[] arrNum =  {-5, -10, 0, -3, 8, 5, -1, 10};
        sortNum(arrNum,arrNum.length);
        System.out.println(Arrays.toString(arrNum));
        System.out.println(Arrays.toString(arrChar));
    }

    private static void sortNum(int[] arrNum, int length) {
        int maxEle = Arrays.stream(arrNum).max().getAsInt();
        int minEle = Arrays.stream(arrNum).min().getAsInt();
        int range = (maxEle-minEle)+1;
        int[] count = new int[range];
        int[] output = new int[length];
        for(int j : arrNum)
        {
            count[j-minEle]++;
        }
        for (int k = 1 ;k<count.length;k++)
        {
            count[k]+=count[k-1];
        }
        for (int l = length-1; l>=0; l--)
        {
            output[count[arrNum[l]-minEle]-1]= arrNum[l];
            --count[arrNum[l]-minEle];
        }
        for (int m = 0 ;m<length;m++){
         arrNum[m] = output[m];
        }
    }

    private static void sortAb(char[] arrChar, int len) {
        // The output character array that will have sorted arr
        int n = 256;
        char[] output = new char[len];
        int[] count = new int[n];
        // Create a count array to store count of individual
        // characters and initialize count array as 0
        for (int i = 0; i < n; i++) {
            count[i]=0;
        }
        // store count of each character
        for (char c : arrChar) {
            //count[arrChar[i]] =arrChar[i];
            ++count[c];
        }
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i) {
            count[i]+=count[i-1];
        }
        for (int i = len-1; i >=0 ; --i) {
            output[count[arrChar[i]]-1] = arrChar[i];
            --count[arrChar[i]];
        }
        // contains sorted characters
        for (int i = 0; i < len; ++i)
            arrChar[i] = output[i];
    }



}
