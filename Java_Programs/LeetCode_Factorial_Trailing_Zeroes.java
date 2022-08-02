
// 172. Factorial Trailing Zeroes : https://leetcode.com/problems/factorial-trailing-zeroes/
public class LeetCode_Factorial_Trailing_Zeroes {
    static long factorial = 0;
    static int counter = 0;

    static int trailingZeroes(int n) {
        if (n <= 0)
            return 0;
        long nn = Math.abs(fact(n));
        factorial = nn;
        int m = trailzero(String.valueOf(String.valueOf(nn)).charAt(String.valueOf(nn).length() - 1),
                String.valueOf(nn).length() - 1);
        return m;
    }

    public static int trailzero(char mm, int po) {
        if (String.valueOf(mm).equals("0") && po > 0) {
            counter++;
            trailzero((String.valueOf(factorial).charAt(po - 1)), po - 1);
        }
        return counter;
    }

    public static long fact(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++)
            fac = fac * i;
        return fac;
    }

    public static void main(String[] args) {
        int nums = 1;
        int ans = trailingZeroes(nums);
        System.out.println(ans);
    }
}

// Output
// Input: n = 3
// Output: 0
// Explanation: 3! = 6, no trailing zero.

// Input: n = 5
// Output: 1
// Explanation: 5! = 120, one trailing zero.

// Input: n = 0
// Output: 0

// Explanation: Given an integer n, return the number of trailing zeroes in n!.
// Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.