
// 70. Climbing Stairs : https://leetcode.com/problems/climbing-stairs/submissions/
public class LeetCode_Climbing_Stairs {
    static int climbStairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int start = 2, end = 3, sum = 0;
        for (int i = 0; i < n - 2; i++) {
            sum = start + end;
            start = end;
            end = sum;
        }
        return start;
    }

    public static void main(String[] args) {
        int num = 2;
        int ans = climbStairs(num);
        System.out.println(ans);
    }
}

// Output
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step