
// 747. Largest Number At Least Twice of Others : https://leetcode.com/problems/largest-number-at-least-twice-of-others/
public class LeetCode_Largest_Number_At_Least_Twice_of_Others {
    static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!(max >= (nums[i] * 2)) && (index != i))
                return -1;
        }
        return index;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4 };
        int[] nums = { 3, 6, 1, 0 };
        int ans = dominantIndex(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [3,6,1,0]
// Output: 1
// Explanation: 6 is the largest integer.
// For every other number in the array x, 6 is at least twice as big as x.
// The index of value 6 is 1, so we return 1.

// Input: nums = [1,2,3,4]
// Output: -1
// Explanation: 4 is less than twice the value of 3, so we return -1.

// Explanation : You are given an integer array nums where the largest integer
// is unique.
// Determine whether the largest element in the array is at least twice as much
// as every other number in the array. If it is, return the index of the largest
// element, or return -1 otherwise.