
// 268. Missing Number : https://leetcode.com/problems/missing-number/
import java.util.Arrays;

public class LeetCode_Missing_Number {
    static int missingNumber(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for (int num : nums) {
            if (start > num)
                start = num;
            if (end < num)
                end = num;
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == arr[i]) {
            } else {
                return i;
            }
        }
        return nums.length;

    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 8, 0, 1 };
        // int[] arr = { 3, 0, 1 };
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
