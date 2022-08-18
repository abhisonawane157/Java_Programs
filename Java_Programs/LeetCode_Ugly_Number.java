
// 263. Ugly Number : https://leetcode.com/problems/ugly-number/
public class LeetCode_Ugly_Number {
    static boolean isUgly(int n) {
        while (n > 0) {
            if (n % 5 == 0) {
                n = n / 5;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 2 == 0) {
                n = n / 2;
            } else {
                break;
            }
        }
        return (n == 1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(isUgly(n));
    }
}

// Output
// Input: n = 6
// Output: true
// Explanation: 6 = 2 × 3

// Input: n = 1
// Output: true
// Explanation: 1 has no prime factors, therefore all of its prime factors are
// limited to 2, 3, and 5.

// Input: n = 14
// Output: false
// Explanation: 14 is not ugly since it includes the prime factor 7.

// Explanation : An ugly number is a positive integer whose prime factors are
// limited to 2, 3, and 5.
// Given an integer n, return true if n is an ugly number.