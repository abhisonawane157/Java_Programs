
// 50. Pow(x, n) : https://leetcode.com/problems/powx-n/
public class LeetCode_Pow_x_n {
    static double myPow(double x, int n) {
        // double ans = 1;
        // while (n > 0) {
        // if ((n & 1) == 1) {
        // ans *= x;
        // }
        // x *= x;
        // n = n >> 1;
        // }
        // return ans;
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        double base = 2;
        int power = -2;
        double ans = myPow(base, power);
        System.out.println(ans);
    }
}

// Output
// Input: x = 2.00000, n = 10
// Output: 1024.00000

// Input: x = 2.10000, n = 3
// Output: 9.26100

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

// Explanation : Implement pow(x, n), which calculates x raised to the power n
// (i.e., xn).