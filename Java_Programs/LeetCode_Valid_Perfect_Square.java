
// 367. Valid Perfect Square : https://leetcode.com/problems/valid-perfect-square/
public class LeetCode_Valid_Perfect_Square {

    static boolean isPerfectSquare(int num) {
        // long nu = 238257692811;
        // long nu = -2147483648;
        // long nu = 2000105819;
        for (int i = 0; i * i >= 0 && i * i <= num; i++) {
            if (i * i == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // int nums1 = 16;
        int nums1 = 2000105819;
        if (isPerfectSquare(nums1))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: num = 16
// Output: true

// Input: num = 14
// Output: false

// Explanation: Given a positive integer num, write a function which returns
// True if num is a perfect square else False.
// Follow up: Do not use any built-in library function such as sqrt.