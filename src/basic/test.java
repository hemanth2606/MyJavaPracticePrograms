package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> strArr = new ArrayList<>();
        strArr.add("aab");
        strArr.add("a");
        strArr.add("bcb");
        strArr.add("awe");
        strArr.add("bbbbbu");
        List<String> query = new ArrayList<>();
        query.add("2-3");
        query.add("4-5");
        System.out.println(hasVowels(strArr,query));
        //System.out.println('1');


    }
    public static List<Integer> hasVowels(List<String> strArr,List<String> query){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<query.size();i++)
        {
            String in = query.get(i);
            String[] arrs = in.split("-");
            int qStart = Integer.parseInt(String.valueOf(arrs[0]));
            int qEnd = Integer.parseInt(String.valueOf(arrs[1]));
            list.add(Vowel(strArr,qStart,qEnd));
        }


        return list;
    }
    static int Vowel(List<String> strArr,int start,int last){
        int count = 0;
        if(last==0)
        {
            return -1;
        }
        for (int i = start; i <last ; i++) {
           String s = strArr.get(start-1);
            for (int j = 0; j < s.length(); j++) {
                if(!isVowel(s.charAt(j)))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');
    }
}
