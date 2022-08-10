
// 1342. Number of Steps to Reduce a Number to Zero : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class LeetCode_Number_of_Steps_to_Reduce_a_Number_to_Zero {

    static int numberOfSteps(int num) {
        return zero(num, 0);
    }

    static int zero(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 != 0)
            return zero(n - 1, count + 1);
        return zero(n / 2, count + 1);
    }

    public static void main(String[] args) {
        int num = 8;
        int ans = numberOfSteps(num);
        System.out.println(ans);

    }
}

// Output
// Input: num = 14
// Output: 6
// Explanation:
// Step 1) 14 is even; divide by 2 and obtain 7.
// Step 2) 7 is odd; subtract 1 and obtain 6.
// Step 3) 6 is even; divide by 2 and obtain 3.
// Step 4) 3 is odd; subtract 1 and obtain 2.
// Step 5) 2 is even; divide by 2 and obtain 1.
// Step 6) 1 is odd; subtract 1 and obtain 0.

// Input: num = 8
// Output: 4
// Explanation:
// Step 1) 8 is even; divide by 2 and obtain 4.
// Step 2) 4 is even; divide by 2 and obtain 2.
// Step 3) 2 is even; divide by 2 and obtain 1.
// Step 4) 1 is odd; subtract 1 and obtain 0.

// Input: num = 123
// Output: 12