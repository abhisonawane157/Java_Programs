
// 2413. Smallest Even Multiple : https://leetcode.com/problems/smallest-even-multiple/
public class LeetCode_Smallest_Even_Multiple {
    static int smallestEvenMultiple(int n) {
        int a = n;
        int b = 2;
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; ++i) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = smallestEvenMultiple(n);
        System.out.println(ans);
    }

}

// Output
// Input: n = 5
// Output: 10
// Explanation: The smallest multiple of both 5 and 2 is 10.

// Input: n = 6
// Output: 6
// Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number
// is a multiple of itself.

// Explanation : Given a positive integer n, return the smallest positive
// integer that is a multiple of both 2 and n.