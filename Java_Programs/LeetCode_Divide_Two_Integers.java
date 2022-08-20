
// 29. Divide Two Integers : https://leetcode.com/problems/divide-two-integers/
public class LeetCode_Divide_Two_Integers {
    static int divide(int dividend, int divisor) {
        int quo = 0;
        if (divisor != 0) {
            if (dividend == divisor)
                return 1;
            if (dividend == Integer.MAX_VALUE && divisor == -1)
                return dividend;
            if (dividend == Integer.MIN_VALUE && divisor == -1)
                return Integer.MAX_VALUE;
            quo = Integer.divideUnsigned(Math.abs(dividend), Math.abs(divisor));
            if (dividend < 0 && divisor < 0)
                return quo;
            else if (dividend > 0 && divisor > 0) {
                return quo;
            } else {
                return (quo * (-1));
            }
        }
        return quo;
    }

    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        int ans = divide(dividend, divisor);
        System.out.println(ans);
    }
}

// Output
// Input: dividend = 10, divisor = 3
// Output: 3
// Explanation: 10/3 = 3.33333.. which is truncated to 3.

// Input: dividend = 7, divisor = -3
// Output: -2
// Explanation: 7/-3 = -2.33333.. which is truncated to -2.

// Explanation : Given two integers dividend and divisor, divide two integers
// without using multiplication, division, and mod operator.
// The integer division should truncate toward zero, which means losing its
// fractional part. For example, 8.345 would be truncated to 8, and -2.7335
// would be truncated to -2.
// Return the quotient after dividing dividend by divisor.
// Note: Assume we are dealing with an environment that could only store
// integers within the 32-bit signed integer range: [−2^31, 2^31 − 1]. For this
// problem, if the quotient is strictly greater than 2^31 - 1, then return 2^31
// -
// 1, and if the quotient is strictly less than -2^31, then return -2^31.