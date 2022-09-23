
// 227. Basic Calculator II : https://leetcode.com/problems/basic-calculator-ii/
import java.util.*;

public class LeetCode_Basic_Calculator_II {
    static int calculate(String s) {
        if (s == null || s.isEmpty())
            return 0;
        int len = s.length();
        Stack<Integer> stk = new Stack<Integer>();
        int currentN = 0;
        char operat = '+';
        for (int i = 0; i < len; i++) {
            char currentC = s.charAt(i);
            if (Character.isDigit(currentC)) {
                currentN = (currentN * 10) + (currentC - '0');
            }
            if (!Character.isDigit(currentC) && !Character.isWhitespace(currentC) || i == len - 1) {
                if (operat == '-') {
                    stk.push(-currentN);
                } else if (operat == '+') {
                    stk.push(currentN);
                } else if (operat == '*') {
                    stk.push(stk.pop() * currentN);
                } else if (operat == '/') {
                    stk.push(stk.pop() / currentN);
                }
                operat = currentC;
                currentN = 0;
            }
        }
        int ans = 0;
        while (!stk.isEmpty()) {
            ans += stk.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        int ans = calculate(s);
        System.out.println(ans);
    }
}

// Output
// Input: s = "3+2*2"
// Output: 7

// Input: s = " 3/2 "
// Output: 1

// Input: s = " 3+5 / 2 "
// Output: 5

// Explanation : Given a string s which represents an expression, evaluate this
// expression and return its value.
// The integer division should truncate toward zero.
// You may assume that the given expression is always valid. All intermediate
// results will be in the range of [-231, 231 - 1].
// Note: You are not allowed to use any built-in function which evaluates
// strings as mathematical expressions, such as eval().