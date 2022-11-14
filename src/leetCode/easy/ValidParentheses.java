package leetCode.easy;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args)
    {
        System.out.println(isValid("([]{})"));
    }
    static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (c)
            {
                case '}':
                    check = stack.pop();
                    if (!(check=='{')){
                        return false;
                    }break;
                case ')':
                    check = stack.pop();
                    if (!(check=='(')){
                        return false;

                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (!(check=='[')){
                        return false;

                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }

}
