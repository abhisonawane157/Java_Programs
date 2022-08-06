
// 704. Binary Search : https://leetcode.com/problems/binary-search/
public class LeetCode_Binary_Search {
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = -1;
        int ans = search(nums, target);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4

// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
// Explanation: 2 does not exist in nums so return -1

// Explanation : Given an array of integers nums which is sorted in ascending
// order, and an integer target, write a function to search target in nums. If
// target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.