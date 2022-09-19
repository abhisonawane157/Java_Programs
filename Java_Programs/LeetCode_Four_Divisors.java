
// 1390. Four Divisors : https://leetcode.com/problems/four-divisors/
public class LeetCode_Four_Divisors {
    static int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans + divisor(num);
        }
        return ans;
    }

    static int divisor(int n) {
        int count = 0;
        int sum = n + 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    return 0;
                } else {
                    sum += i + n / i;
                    count += 2;
                }
            }
        }
        return count == 2 ? sum : 0;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int ans = sumFourDivisors(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [21,4,7]
// Output: 32
// Explanation:
// 21 has 4 divisors: 1, 3, 7, 21
// 4 has 3 divisors: 1, 2, 4
// 7 has 2 divisors: 1, 7
// The answer is the sum of divisors of 21 only.

// Input: nums = [21,21]
// Output: 64

// Input: nums = [1,2,3,4,5]
// Output: 0

// Explanation : Given an integer array nums, return the sum of divisors of the
// integers in that array that have exactly four divisors. If there is no such
// integer in the array, return 0.