
// 20. Valid Parentheses : https://leetcode.com/problems/valid-parentheses/
import java.util.*;

public class LeetCode_Valid_Parentheses {
    static boolean isValid(String s) {
        if (s.charAt(0) == ']' || s.charAt(0) == ')' || s.charAt(0) == '}')
            return false;
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(getEquivalent(ch));
            } else if (stk.isEmpty() || stk.pop() != ch) {
                return false;
            }
        }
        return stk.isEmpty();
    }

    static Character getEquivalent(Character ch) {
        if (ch == '{')
            return '}';
        else if (ch == '(')
            return ')';
        else
            return ']';
    }

    public static void main(String[] args) {
        String s = "()]";
        System.out.println(isValid(s));
    }
}

// Output
// Input: s = "()"
// Output: true

// Input: s = "()[]{}"
// Output: true

// Input: s = "(]"
// Output: false

// Explanation : Given a string s containing just the characters '(', ')', '{',
// '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.