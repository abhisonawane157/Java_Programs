
// 162. Find Peak Element : https://leetcode.com/problems/find-peak-element/
import java.util.*;

public class LeetCode_Find_Peak_Element {
    static int findPeakElement(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        int peak = arr1[arr1.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == peak) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index
// number 2.

// Input: nums = [1,2,1,3,5,6,4]
// Output: 5
// Explanation: Your function can return either index number 1 where the peak
// element is 2, or index number 5 where the peak element is 6.

// Explanation: A peak element is an element that is strictly greater than its
// neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its
// index. If the array contains multiple peaks, return the index to any of the
// peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is
// always considered to be strictly greater than a neighbor that is outside the
// array.
// You must write an algorithm that runs in O(log n) time.