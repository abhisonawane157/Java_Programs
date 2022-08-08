
// 342. Power of Four : https://leetcode.com/problems/power-of-four/
public class LeetCode_Power_of_Four {

    static boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;

        while (n % 4 == 0)
            n /= 4;

        return n == 1;
    }

    public static void main(String[] args) {
        int num = 19684;
        if (isPowerOfFour(num))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: n = 15
// Output: true

// Input: n = 5
// Output: false

// Input: n = 1
// Output: true

// Explanation : Given an integer n, return true if it is a power of four.
// Otherwise, return false.
// An integer n is a power of four, if there exists an integer x such that n ==
// 4x.