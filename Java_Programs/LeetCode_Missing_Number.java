
// 268. Missing Number : https://leetcode.com/problems/missing-number/
public class LeetCode_Missing_Number {
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != nums[nums[i]])
                swap(nums, i, nums[i]);
            else
                i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        // int[] arr = { 0, 1 };
        int[] arr = { 3, 0, 1 };
        // int[] arr = { 0, 1 };
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8
// Explanation: n = 9 since there are 9 numbers, so all numbers are in the range
// [0,9].
// 8 is the missing number in the range since it does not appear in nums.

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range
// [0,3].
// 2 is the missing number in the range since it does not appear in nums.

// Input: nums = [0,1]
// Output: 2
// Explanation: n = 2 since there are 2 numbers, so all numbers are in the range
// [0,2].
// 2 is the missing number in the range since it does not appear in nums.
