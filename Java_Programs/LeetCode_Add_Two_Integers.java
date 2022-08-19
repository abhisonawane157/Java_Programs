
// 2235. Add Two Integers : https://leetcode.com/problems/add-two-integers/

public class LeetCode_Add_Two_Integers {

    static int sum(int num1, int num2) {
        return Integer.sum(num1, num2);
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 6;
        int ans = sum(num1, num2);
        System.out.println(ans);
    }
}

// Output
// Input: num1 = 12, num2 = 5
// Output: 17
// Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is
// returned.

// Input: num1 = -10, num2 = 4
// Output: -6
// Explanation: num1 + num2 = -6, so -6 is returned.

// Explanation: Given two integers num1 and num2, return the sum of the two
// integers.