
// 507. Perfect Number : https://leetcode.com/problems/perfect-number/
public class LeetCode_Perfect_Number {

    static boolean checkPerfectNumber(int num) {
        if (num <= 1)
            return true;
        int sum = 0;
        for (int i = 1; i < num && sum <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                System.out.println(i + " " + sum);
            }
            if (sum == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 2016;
        if (checkPerfectNumber(num))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: num = 28
// Output: true
// Explanation: 28 = 1 + 2 + 4 + 7 + 14
// 1, 2, 4, 7, and 14 are all divisors of 28.

// Input: num = 7
// Output: false

// Explanation: A perfect number is a positive integer that is equal to the sum
// of its positive divisors, excluding the number itself. A divisor of an
// integer x is an integer that can divide x evenly.
// Given an integer n, return true if n is a perfect number, otherwise return
// false.
