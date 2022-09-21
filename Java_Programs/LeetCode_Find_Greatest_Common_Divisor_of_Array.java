
// 1979. Find Greatest Common Divisor of Array : https://leetcode.com/problems/find-greatest-common-divisor-of-array/
public class LeetCode_Find_Greatest_Common_Divisor_of_Array {
    static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int gcd = 1;
        for (int i = 1; i <= min && i <= max; ++i) {
            if (min % i == 0 && max % i == 0)
                gcd = i;
        }

        return gcd;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 5, 6, 9, 10 };
        int[] nums = { 3, 3 };
        int ans = findGCD(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [2,5,6,9,10]
// Output: 2
// Explanation:
// The smallest number in nums is 2.
// The largest number in nums is 10.
// The greatest common divisor of 2 and 10 is 2.

// Input: nums = [7,5,6,8,3]
// Output: 1
// Explanation:
// The smallest number in nums is 3.
// The largest number in nums is 8.
// The greatest common divisor of 3 and 8 is 1.

// Input: nums = [3,3]
// Output: 3
// Explanation:
// The smallest number in nums is 3.
// The largest number in nums is 3.
// The greatest common divisor of 3 and 3 is 3.

// Explanation : Given an integer array nums, return the greatest common divisor
// of the smallest number and largest number in nums.
// The greatest common divisor of two numbers is the largest positive integer
// that evenly divides both numbers.