
// 1295. Find Numbers with Even Number of Digits : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LeetCode_Find_Numbers_with_Even_Number_of_Digits {

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int nuum = (int) Math.log10(nums[i]) + 1;
            if (nuum % 2 == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation:
// 12 contains 2 digits (even number of digits).
// 345 contains 3 digits (odd number of digits).
// 2 contains 1 digit (odd number of digits).
// 6 contains 1 digit (odd number of digits).
// 7896 contains 4 digits (even number of digits).
// Therefore only 12 and 7896 contain an even number of digits.

// Input: nums = [555,901,482,1771]
// Output: 1
// Explanation:
// Only 1771 contains an even number of digits.

// Explanation : Given an array nums of integers, return how many of them
// contain an even number of digits.