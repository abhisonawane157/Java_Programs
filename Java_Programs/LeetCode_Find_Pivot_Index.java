
// 724. Find Pivot Index : https://leetcode.com/problems/find-pivot-index/
public class LeetCode_Find_Pivot_Index {
    static int pivotIndex(int[] nums) {
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
        int ans = pivotIndex(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,7,3,6,5,6]
// Output: 3
// Explanation:
// The pivot index is 3.
// Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
// Right sum = nums[4] + nums[5] = 5 + 6 = 11

// Input: nums = [1,2,3]
// Output: -1
// Explanation:
// There is no index that satisfies the conditions in the problem statement.

// Input: nums = [2,1,-1]
// Output: 0
// Explanation:
// The pivot index is 0.
// Left sum = 0 (no elements to the left of index 0)
// Right sum = nums[1] + nums[2] = 1 + -1 = 0

// Explanation : Given an array of integers nums, calculate the pivot index of
// this array.
// The pivot index is the index where the sum of all the numbers strictly to the
// left of the index is equal to the sum of all the numbers strictly to the
// index's right.
// If the index is on the left edge of the array, then the left sum is 0 because
// there are no elements to the left. This also applies to the right edge of the
// array.
// Return the leftmost pivot index. If no such index exists, return -1.