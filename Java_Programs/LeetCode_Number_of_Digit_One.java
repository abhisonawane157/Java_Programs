
// 233. Number of Digit One : https://leetcode.com/problems/number-of-digit-one/
public class LeetCode_Number_of_Digit_One {
    static int countDigitOne(int n) {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0L), i);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1000;
        int ans = countDigitOne(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 13
// Output: 6

// Input: n = 0
// Output: 0

// Explanation : Given an integer n, count the total number of digit 1 appearing
// in all non-negative integers less than or equal to n.