
// 2357. Make Array Zero by Subtracting Equal Amounts : https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
public class LeetCode_Make_Array_Zero_by_Subtracting_Equal_Amounts {
    static int minimumOperations(int[] nums) {
        int min = min(nums);
        if (min == Integer.MAX_VALUE)
            return 0;
        int count = 0;
        int c = 0;
        while (count < nums.length) {
            // c++;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    nums[i] = nums[i] - min;
                } else {
                    count++;
                }
            }
            // System.out.print(count + " - " + nums.length);
            if (count >= nums.length) {
                break;
            } else {
                c++;
                count = 0;
                min = min(nums);
            }
            // System.out.println(Arrays.toString(nums));
        }
        return c;
    }

    static int min(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 84 };
        // int[] arr = { 1, 5, 0, 3, 5 };
        int ans = minimumOperations(arr);
        System.out.println(ans);
    }
}

// Output

// Input: nums = [1,5,0,3,5]
// Output: 3
// Explanation:
// In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
// In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
// In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].

// Input: nums = [0]
// Output: 0
// Explanation: Each element in nums is already 0 so no operations are needed.

// Explanation : You are given a non-negative integer array nums. In one
// operation, you must:
// Choose a positive integer x such that x is less than or equal to the smallest
// non-zero element in nums.
// Subtract x from every positive element in nums.
// Return the minimum number of operations to make every element in nums equal
// to 0.