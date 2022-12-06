package dataStructure.recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        String s1 = "abc";
        ArrayList<String> ans  = returnSubSetCom("","123");
        System.out.println(ans);
//        System.out.println(numberCombination("12"));
//        System.out.println(dices(4));
    }
    static ArrayList<String> returnSubSetCom(String p, String up){
        if (up.isEmpty())
        {
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans =new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(returnSubSetCom(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    static List<String> numberCombination(String digits){
        List<String> list = new ArrayList<>();
        list.addAll( pad("",digits));
        return list;
    }
    static  ArrayList<String> pad(String p , String up)
    {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }
    static List<String> dice(String s ,int target)
    {
        if (target ==0)
        {
            List<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        if (target>=7){
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i <=6&&target>=i ; i++) {
            list.addAll(dice(s+i,target-i));
        }
        return list;

    }
    static List<String> dices(int target)
    {
        List<String> list = new ArrayList<>();
        list.addAll(dice("",target));
        return list;
    }

}
