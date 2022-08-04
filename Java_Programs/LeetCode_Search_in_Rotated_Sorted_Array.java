
// 33. Search in Rotated Sorted Array : https://leetcode.com/problems/search-in-rotated-sorted-array/
// import java.util.*;

public class LeetCode_Search_in_Rotated_Sorted_Array {
    static int search(int[] nums, int target) {
        // --Method -1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;

        // --Method -2
        // int[] arr1 = new int[nums.length];
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = nums[i];
        // }
        // int pivot = 0;
        // Arrays.sort(arr1);
        // int peak = arr1[arr1.length - 1];
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == peak) {
        // pivot = i;
        // }
        // }
        // if (nums[pivot] == target) {
        // return pivot;
        // }
        // if (target >= nums[0]) {
        // return bsearch(nums, target, 0, pivot - 1);
        // }
        // return bsearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int bsearch(int[] num, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1

// Input: nums = [1], target = 0
// Output: -1

// Explanation: There is an integer array nums sorted in ascending order (with
// distinct values).
// Prior to being passed to your function, nums is possibly rotated at an
// unknown pivot index k (1 <= k < nums.length) such that the resulting array is
// [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
// (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
// and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target,
// return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.