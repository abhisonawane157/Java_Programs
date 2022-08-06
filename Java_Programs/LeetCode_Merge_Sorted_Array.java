
// 88. Merge Sorted Array : https://leetcode.com/problems/merge-sorted-array/

import java.util.*;

public class LeetCode_Merge_Sorted_Array {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < (m + n); i++) {
            nums1[i] = nums2[j];
            j++;
        }
        nums1 = insertionsort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    static int[] insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
            }
        }
        return arr;
    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }

    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int[] nums2 = { 2, 5, 6 };
        // int m = 3;
        // int n = 3;
        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        int m = 0;
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}

// Output
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
// from nums1.

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there
// to ensure the merge result can fit in nums1.

// Explanation : You are given two integer arrays nums1 and nums2, sorted in
// non-decreasing order, and two integers m and n, representing the number of
// elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function, but instead be
// stored inside the array nums1. To accommodate this, nums1 has a length of m +
// n, where the first m elements denote the elements that should be merged, and
// the last n elements are set to 0 and should be ignored. nums2 has a length of
// n.