
// 1837. Sum of Digits in Base K : https://leetcode.com/problems/sum-of-digits-in-base-k/
public class LeetCode_Sum_of_Digits_in_Base_K {
    static int sumBase(int n, int k) {
        String a = Integer.toString(n, k);
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 10;
        int ans = sumBase(n, k);
        System.out.println(ans);
    }
}

// Output
// Input: n = 34, k = 6
// Output: 9
// Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.

// Input: n = 10, k = 10
// Output: 1
// Explanation: n is already in base 10. 1 + 0 = 1.

// Explanation : Given an integer n (in base 10) and a base k, return the sum of
// the digits of n after converting n from base 10 to base k.
// After converting, each digit should be interpreted as a base 10 number, and
// the sum should be returned in base 10.