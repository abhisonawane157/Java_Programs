
// 1991. Find the Middle Index in Array : https://leetcode.com/problems/find-the-middle-index-in-array/
public class LeetCode_Find_the_Middle_Index_in_Array {
    static int findMiddleIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int start = 0;
        int end = total - nums[0];
        int i = 1;
        while (start != end && i < nums.length) {
            start = start + nums[i - 1];
            end = end - nums[i];
            i++;
        }
        if (start == end) {
            return i - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        // int[] nums = { 2, 1, -1 };
        int ans = findMiddleIndex(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [2,3,-1,8,4]
// Output: 3
// Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
// The sum of the numbers after index 3 is: 4 = 4

// Input: nums = [1,-1,4]
// Output: 2
// Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
// The sum of the numbers after index 2 is: 0

// Input: nums = [2,5]
// Output: -1
// Explanation: There is no valid middleIndex.

// Explanation : Given a 0-indexed integer array nums, find the leftmost
// middleIndex (i.e., the smallest amongst all the possible ones).
// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1]
// == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if
// middleIndex == nums.length - 1, the right side sum is considered to be 0.
// Return the leftmost middleIndex that satisfies the condition, or -1 if there
// is no such index.