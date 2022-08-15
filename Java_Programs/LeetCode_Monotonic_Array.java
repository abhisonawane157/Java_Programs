
// 896. Monotonic Array : https://leetcode.com/problems/monotonic-array/
public class LeetCode_Monotonic_Array {
    static boolean isMonotonic(int[] nums) {
        return (ascen(nums) || descen(nums));
    }

    static boolean ascen(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (!(nums[start] <= nums[start + 1])) {
                return false;
            }
            start++;
        }
        return true;
    }

    static boolean descen(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (!(nums[start] >= nums[start + 1])) {
                return false;
            }
            start++;
        }
        return true;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 2, 3 };
        int[] nums = { 6, 5, 4, 4 };
        System.out.println(isMonotonic(nums));
    }
}
// Output
// Input: nums = [1,2,2,3]
// Output: true

// Input: nums = [6,5,4,4]
// Output: true

// Input: nums = [1,3,2]
// Output: false

// Explanation : An array is monotonic if it is either monotone increasing or
// monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
// An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or
// false otherwise.