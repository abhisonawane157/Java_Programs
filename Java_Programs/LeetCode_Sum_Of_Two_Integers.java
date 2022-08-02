
// 371. Sum of Two Integers : https://leetcode.com/problems/sum-of-two-integers/
public class LeetCode_Sum_Of_Two_Integers {

    static int getSum(int a, int b) {
        return Integer.sum(a, b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int ans = getSum(a, b);
        System.out.println(ans);
    }
}

// Output
// Input: a = 1, b = 2
// Output: 3

// Input: a = 2, b = 3
// Output: 5

// Explanation: Given two integers a and b, return the sum of the two integers
// without using the operators + and -.