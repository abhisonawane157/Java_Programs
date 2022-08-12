
// 905. Sort Array By Parity : https://leetcode.com/problems/sort-array-by-parity/
import java.util.*;

public class LeetCode_Sort_Array_By_Parity {
    static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] % 2 != 0 && nums[end] % 2 == 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            } else if (nums[start] % 2 == 0) {
                start++;
            } else if (nums[end] % 2 != 0) {
                end--;
            } else {
                start++;
                end--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 1, 2, 4 };
        int[] nums = { 0, 1, 2 };
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be
// accepted.

// Input: nums = [0]
// Output: [0]

// Explanation : Given an integer array nums, move all the even integers at the
// beginning of the array followed by all the odd integers.
// Return any array that satisfies this condition.