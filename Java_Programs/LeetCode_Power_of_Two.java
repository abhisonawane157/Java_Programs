
// 231. Power of Two : https://leetcode.com/problems/power-of-two/
public class LeetCode_Power_of_Two {

    static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        while (n % 2 == 0)
            n /= 2;
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 1;
        if (isPowerOfTwo(n))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: n = 1
// Output: true
// Explanation: 20 = 1

// Input: n = 16
// Output: true
// Explanation: 24 = 16

// Input: n = 3
// Output: false

// Explanation : Given an integer n, return true if it is a power of two.
// Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n ==
// 2x.