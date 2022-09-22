
// 172. Factorial Trailing Zeroes : https://leetcode.com/problems/factorial-trailing-zeroes/
public class LeetCode_Factorial_Trailing_Zeroes {
    static int trailingZeroes(int n) {
        int ans = 0;
        while (n >= 5) {
            n /= 5;
            ans += n;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums = 1000;
        int ans = trailingZeroes(nums);
        System.out.println(ans);
    }
}

// Output
// Input: n = 3
// Output: 0
// Explanation: 3! = 6, no trailing zero.

// Input: n = 5
// Output: 1
// Explanation: 5! = 120, one trailing zero.

// Input: n = 0
// Output: 0

// Explanation: Given an integer n, return the number of trailing zeroes in n!.
// Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.