
// 2180. Count Integers With Even Digit Sum : https://leetcode.com/problems/count-integers-with-even-digit-sum/
public class LeetCode_Count_Integers_With_Even_Digit_Sum {
    static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (evenSum(i))
                count++;
        }
        return count;
    }

    static boolean evenSum(int n) {
        String nn = String.valueOf(n);
        n = 0;
        for (int i = 0; i < nn.length(); i++) {
            n = n + Integer.parseInt(String.valueOf(nn.charAt(i)));
        }
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 30;
        int ans = countEven(num);
        System.out.println(ans);
    }
}

// Output
// Input: num = 4
// Output: 2
// Explanation:
// The only integers less than or equal to 4 whose digit sums are even are 2 and
// 4.

// Input: num = 30
// Output: 14
// Explanation:
// The 14 integers less than or equal to 30 whose digit sums are even are
// 2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.

// Explanation : Given a positive integer num, return the number of positive
// integers less than or equal to num whose digit sums are even.
// The digit sum of a positive integer is the sum of all its digits.