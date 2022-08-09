
// 69. Sqrt(x) : https://leetcode.com/problems/sqrtx/submissions/
public class LeetCode_Sqrt_x {

    static int mySqrt(int x) {
        if (x == 0)
            return 0;
        double n = x;
        double root;
        while (true) {
            root = 0.5 * (n + (x / n));
            if (Math.abs(root - n) < 0.5) {
                break;
            }
            n = root;
        }
        return (int) root;
    }

    public static void main(String[] args) {
        int x = 8;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
}

// Output
// Input: x = 4
// Output: 2

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since the decimal part
// is truncated, 2 is returned.

// Explanation : Given a non-negative integer x, compute and return the square
// root of x.
// Since the return type is an integer, the decimal digits are truncated, and
// only the integer part of the result is returned.
// Note: You are not allowed to use any built-in exponent function or operator,
// such as pow(x, 0.5) or x ** 0.5.