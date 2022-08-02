
// 326. Power of Three : https://leetcode.com/problems/power-of-three/
public class LeetCode_Power_of_Three {
    static boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        if (n < 3)
            return false;
        while (n > 3) {
            if (n % 3 == 0) {
                n = n / 3;
                if (n < 3)
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 19684;
        if (isPowerOfThree(num))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: n = 27
// Output: true

// Input: n = 0
// Output: false

// Input: n = 9
// Output: true

// Explanation: Given an integer n, return true if it is a power of three.
// Otherwise, return false.
// An integer n is a power of three, if there exists an integer x such that n ==
// 3x.