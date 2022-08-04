
// 448. Find All Numbers Disappeared in an Array : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.*;

public class LeetCode_Find_All_Numbers_Disappeared_in_an_Array {
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(j + 1);
            }
        }
        return list;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        // int[] arr = { 0, 1 };
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // int[] arr = { 0, 1 };
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Input: nums = [1,1]
// Output: [2]

// Explanation: Given an array nums of n integers where nums[i] is in the range
// [1, n], return an array of all the integers in the range [1, n] that do not
// appear in nums.
