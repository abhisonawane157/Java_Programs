
// 509. Fibonacci Number : https://leetcode.com/problems/fibonacci-number/
public class LeetCode_Fibonacci_Number {

    static int fib(int n) {
        int f = 0;
        int s = 1;
        int ne = 0;
        for (int i = 1; i <= (n); i++) {
            if (n == 1) {
                return 1;
            } else {
                // System.out.print(f + ", ");
                ne = f + s;
                f = s;
                s = ne;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        int num = 14;
        int ans = fib(num);
        System.out.println(ans);
    }
}

// Output
// Input: n = 2
// Output: 1
// Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

// Input: n = 3
// Output: 2
// Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

// Input: n = 4
// Output: 3
// Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

// Explanation: The Fibonacci numbers, commonly denoted F(n) form a sequence,
// called the Fibonacci sequence, such that each number is the sum of the two
// preceding ones, starting from 0 and 1. That is,

// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.