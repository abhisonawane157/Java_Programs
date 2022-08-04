
// 81. Search in Rotated Sorted Array II : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class LeetCode_Search_in_Rotated_Sorted_Array_II {

    static boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        if (search(nums, target))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: nums = [2,5,6,0,0,1,2], target = 0
// Output: true

// Input: nums = [2,5,6,0,0,1,2], target = 3
// Output: false

// Explanation: There is an integer array nums sorted in non-decreasing order
// (not necessarily with distinct values).
// Before being passed to your function, nums is rotated at an unknown pivot
// index k (0 <= k < nums.length) such that the resulting array is [nums[k],
// nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
// example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become
// [4,5,6,6,7,0,1,2,4,4].
// Given the array nums after the rotation and an integer target, return true if
// target is in nums, or false if it is not in nums.
// You must decrease the overall operation steps as much as possible.