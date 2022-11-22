package leetCode.medium;

import java.util.HashMap;

public class CountAndSay {

    public static void main(String[] args)
    {
        String arr =  new String[]{"faew","reawr","rear","raew"}[3];
        System.out.println(arr);
        System.out.println(countAndSay(5));
    }
    public static String countAndSay(int n) {
        if(n == 1) return "1";

        StringBuilder res = new StringBuilder();

        String s = countAndSay(n-1) + "0";
        for(int i=0, c=1; i < s.length()-1; i++, c++){
            if(s.charAt(i+1) != s.charAt(i)){
                res.append(c).append(s.charAt(i));
                c = 0;
            }
        }

        return res.toString();
    }

    private static String countString(String s, int n) {
        return "";
    }
    public static String CountInt(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
        return map.toString();
    }
}
