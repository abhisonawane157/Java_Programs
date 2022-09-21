
// 2367. Number of Arithmetic Triplets : https://leetcode.com/problems/number-of-arithmetic-triplets/
public class LeetCode_Number_of_Arithmetic_Triplets {

    static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i < j && j < k) {
                        if ((nums[j] - nums[i]) == diff && (nums[k] - nums[j]) == diff) {
                            count++;
                            System.out.println(nums[i] + " | " + nums[j] + " | " + nums[k]);
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 9 };
        // int[] nums = { 0, 1, 4, 6, 7, 10 };
        int diff = 2;
        int ans = arithmeticTriplets(nums, diff);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [0,1,4,6,7,10], diff = 3
// Output: 2
// Explanation:
// (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
// (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.

// Input: nums = [4,5,6,7,8,9], diff = 2
// Output: 2
// Explanation:
// (0, 2, 4) is an arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2.
// (1, 3, 5) is an arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.

// Explanation : You are given a 0-indexed, strictly increasing integer array
// nums and a positive integer diff. A triplet (i, j, k) is an arithmetic
// triplet if the following conditions are met:
// i < j < k,
// nums[j] - nums[i] == diff, and
// nums[k] - nums[j] == diff.
// Return the number of unique arithmetic triplets.