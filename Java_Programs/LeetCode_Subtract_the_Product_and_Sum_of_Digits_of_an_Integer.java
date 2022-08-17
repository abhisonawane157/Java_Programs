
// 1281. Subtract the Product and Sum of Digits of an Integer : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class LeetCode_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    static int subtractProductAndSum(int n) {
        // int count = ((int) Math.log10(n) + 1);
        String nn = String.valueOf(n);
        int prod = 1;
        int sum = 0;
        for (int i = 0; i < nn.length(); i++) {
            prod = prod * Integer.parseInt(String.valueOf(nn.charAt(i)));
            sum = sum + Integer.parseInt(String.valueOf(nn.charAt(i)));
        }
        return prod - sum;
    }

    public static void main(String[] args) {
        int n = 4421;
        int ans = subtractProductAndSum(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 234
// Output: 15
// Explanation:
// Product of digits = 2 * 3 * 4 = 24
// Sum of digits = 2 + 3 + 4 = 9
// Result = 24 - 9 = 15

// Input: n = 4421
// Output: 21
// Explanation:
// Product of digits = 4 * 4 * 2 * 1 = 32
// Sum of digits = 4 + 4 + 2 + 1 = 11
// Result = 32 - 11 = 21

// Explanation : Given an integer number n, return the difference between the
// product of its digits and the sum of its digits.