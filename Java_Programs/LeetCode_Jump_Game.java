
// 55. Jump Game : https://leetcode.com/problems/jump-game/
public class LeetCode_Jump_Game {
    static boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            System.out.println(max);
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 }; // t
        // int[] nums = { 2, 0 }; // t
        // int[] nums = { 3, 0, 1 };// t
        // int[] nums = { 3, 2, 1, 0, 4 }; // f
        // int[] nums = { 0 }; // t
        // int[] nums = { 2, 5, 0, 0 }; // t
        // int[] nums = { 1, 2, 3 }; // t
        // int[] nums = { 1, 3, 2 }; // t
        if (canJump(nums))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

// Input: nums = [3,2,1,0,4]
// Output: false
// Explanation: You will always arrive at index 3 no matter what. Its maximum
// jump length is 0, which makes it impossible to reach the last index.

// Explanation: You are given an integer array nums. You are initially
// positioned at the array's first index, and each element in the array
// represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.