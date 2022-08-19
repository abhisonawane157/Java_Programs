
// 2293. Min Max Game : https://leetcode.com/problems/min-max-game/
public class LeetCode_Min_Max_Game {
    static int minMaxGame(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[nums.length / 2];
        int i = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        while (n >= 1) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
            n -= 2;
            i++;
        }
        return minMaxGame(newNums);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 2, 4, 8, 2, 2 };
        int ans = minMaxGame(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,3,5,2,4,8,2,2]
// Output: 1
// Explanation: The following arrays are the results of applying the algorithm
// repeatedly.
// First: nums = [1,5,4,2]
// Second: nums = [1,4]
// Third: nums = [1]
// 1 is the last remaining number, so we return 1.

// Input: nums = [3]
// Output: 3
// Explanation: 3 is already the last remaining number, so we return 3.

// Explanation : You are given a 0-indexed integer array nums whose length is a
// power of 2.
// Apply the following algorithm on nums:
// Let n be the length of nums. If n == 1, end the process. Otherwise, create a
// new 0-indexed integer array newNums of length n / 2.
// For every even index i where 0 <= i < n / 2, assign the value of newNums[i]
// as min(nums[2 * i], nums[2 * i + 1]).
// For every odd index i where 0 <= i < n / 2, assign the value of newNums[i] as
// max(nums[2 * i], nums[2 * i + 1]).
// Replace the array nums with newNums.
// Repeat the entire process starting from step 1.
// Return the last number that remains in nums after applying the algorithm.