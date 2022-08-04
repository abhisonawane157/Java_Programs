
// 410. Split Array Largest Sum : https://leetcode.com/problems/split-array-largest-sum/
public class LeetCode_Split_Array_Largest_Sum {

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int m = 2;
        int ans = splitArray(nums, m);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [7,2,5,10,8], m = 2
// Output: 18
// Explanation:
// There are four ways to split nums into two subarrays.
// The best way is to split it into [7,2,5] and [10,8],
// where the largest sum among the two subarrays is only 18.

// Input: nums = [1,2,3,4,5], m = 2
// Output: 9

// Explanation : Given an array nums which consists of non-negative integers and
// an integer m, you can split the array into m non-empty continuous subarrays.
// Write an algorithm to minimize the largest sum among these m subarrays.