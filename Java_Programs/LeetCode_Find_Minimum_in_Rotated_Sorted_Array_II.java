
// 154. Find Minimum in Rotated Sorted Array II : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
import java.util.*;

public class LeetCode_Find_Minimum_in_Rotated_Sorted_Array_II {

    static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {};
        int ans = findMin(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,3,5]
// Output: 1

// Input: nums = [2,2,2,0,1]
// Output: 0

// Explanation : Suppose an array of length n sorted in ascending order is
// rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7]
// might become:
// [4,5,6,7,0,1,4] if it was rotated 4 times.
// [0,1,4,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results
// in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
// Given the sorted rotated array nums that may contain duplicates, return the
// minimum element of this array.
// You must decrease the overall operation steps as much as possible.