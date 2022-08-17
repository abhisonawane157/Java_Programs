
// 1486. XOR Operation in an Array : https://leetcode.com/problems/xor-operation-in-an-array/
public class LeetCode_XOR_Operation_in_an_Array {
    static int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
        }
        int u = 0;
        for (int a : arr) {
            u ^= a;
        }
        return u;
    }

    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        int ans = xorOperation(n, start);
        System.out.println(ans);
    }
}

// Output
// Input: n = 5, start = 0
// Output: 8
// Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8)
// = 8.
// Where "^" corresponds to bitwise XOR operator.

// Input: n = 4, start = 3
// Output: 8
// Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.

// Explanation : You are given an integer n and an integer start.
// Define an array nums where nums[i] = start + 2 * i (0-indexed) and n ==
// nums.length.
// Return the bitwise XOR of all elements of nums.