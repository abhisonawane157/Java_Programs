
// 4. Median of Two Sorted Arrays : https://leetcode.com/problems/median-of-two-sorted-arrays/
import java.util.*;

public class LeetCode_Median_of_Two_Sorted_Arrays {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        int h = 0;
        for (int i = nums1.length; i < arr.length; i++) {
            arr[i] = nums2[h];
            h++;
        }
        Arrays.sort(arr);
        if ((arr.length % 2) == 0) {
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2, 4 };
        Double ans = findMedianSortedArrays(arr1, arr2);
        System.out.println("ans: " + ans);
    }
}

// Output
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

// Explanation:
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return
// the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n))