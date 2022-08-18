
// 1952. Three Divisors : https://leetcode.com/problems/three-divisors/
public class LeetCode_Three_Divisors {
    static boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return (count == 3);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(isThree(n));
    }
}

// Output
// Input: n = 2
// Output: false
// Explantion: 2 has only two divisors: 1 and 2.

// Input: n = 4
// Output: true
// Explantion: 4 has three divisors: 1, 2, and 4.

// Explanation : Given an integer n, return true if n has exactly three positive
// divisors. Otherwise, return false.
// An integer m is a divisor of n if there exists an integer k such that n = k *
// m.