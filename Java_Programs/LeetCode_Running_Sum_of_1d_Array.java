
// 1480. Running Sum of 1d Array : https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.*;

public class LeetCode_Running_Sum_of_1d_Array {
    static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 9, 8 };
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
}
// Output
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1,
// 1+1+1+1+1].

// Input: nums = [3,1,2,10,1]
// Output: [3,4,6,16,17]

// Explanation : Given an array nums. We define a running sum of an array as
// runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.