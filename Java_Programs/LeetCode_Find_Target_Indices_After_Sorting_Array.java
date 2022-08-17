
// 2089. Find Target Indices After Sorting Array : https://leetcode.com/problems/find-target-indices-after-sorting-array/
import java.util.*;

public class LeetCode_Find_Target_Indices_After_Sorting_Array {
    static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            } else if (nums[i] > target) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 5;
        List<Integer> ans = targetIndices(nums, target);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,2,5,2,3], target = 2
// Output: [1,2]
// Explanation: After sorting, nums is [1,2,2,3,5].
// The indices where nums[i] == 2 are 1 and 2.

// Input: nums = [1,2,5,2,3], target = 3
// Output: [3]
// Explanation: After sorting, nums is [1,2,2,3,5].
// The index where nums[i] == 3 is 3.

// Input: nums = [1,2,5,2,3], target = 5
// Output: [4]
// Explanation: After sorting, nums is [1,2,2,3,5].
// The index where nums[i] == 5 is 4.

// Explanation : You are given a 0-indexed integer array nums and a target
// element target.
// A target index is an index i such that nums[i] == target.
// Return a list of the target indices of nums after sorting nums in
// non-decreasing order. If there are no target indices, return an empty list.
// The returned list must be sorted in increasing order.