package leetCode.easy;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        RomanToInteger1 ob=new RomanToInteger1();
        System.out.println("The corresponding Integer value is: "+ob.convertRomanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        for (char c : s.toCharArray()) {
            ans += map.get(c);

        }
        return ans;
    }

    static class RomanToInteger1 {
        int value(char r) {
            if (r == 'I')
                return 1;
            if (r == 'V')
                return 5;
            if (r == 'X')
                return 10;
            if (r == 'L')
                return 50;
            if (r == 'C')
                return 100;
            if (r == 'D')
                return 500;
            if (r == 'M')
                return 1000;
            return -1;
        }

        //function to convert roman to integer
        int convertRomanToInt(String s) {
//variable to store the sum
            int total = 0;
//loop iterate over the string (given roman numeral)
//getting value from symbol s1[i]
            for (int i = 0; i < s.length(); i++) {
                int s1 = value(s.charAt(i));
//getting value of symbol s2[i+1]
                if (i + 1 < s.length()) {
                    int s2 = value(s.charAt(i + 1));
//comparing the current character from its right character
                    if (s1 >= s2) {
//if the value of current character is greater or equal to the next symbol
                        total = total + s1;
                    } else {
//if the value of the current character is less than the next symbol
                        total = total - s1;
                    }
                } else {
                    total = total + s1;
                }
            }
//returns corresponding integer value
            return total;
        }
    }
}