
// 496. Next Greater Element I : https://leetcode.com/problems/next-greater-element-i/
import java.util.*;

public class LeetCode_Next_Greater_Element_I {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if ((j + 1) == nums2.length) {
                        result[i] = -1;
                    } else {
                        if ((j + 1) != nums2.length)
                            result[i] = maxx(nums2, j, nums2.length - 1);
                        else
                            result[i] = -1;
                    }
                }
            }
        }
        return result;
    }

    static int maxx(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (max < arr[i]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 4 };
        int[] nums2 = { 1, 2, 3, 4 };
        // int[] nums1 = { 4, 1, 2 };
        // int[] nums2 = { 1, 3, 4, 2 };
        // int[] nums1 = { 1, 3, 5, 2, 4 };
        // int[] nums2 = { 6, 5, 4, 3, 2, 1, 7 };
        int[] ans = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so
// the answer is -1.
// - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
// - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so
// the answer is -1.

// Input: nums1 = [2,4], nums2 = [1,2,3,4]
// Output: [3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
// - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so
// the answer is -1.

// Explanation: The next greater element of some element x in an array is the
// first greater element that is to the right of x in the same array.
// You are given two distinct 0-indexed integer arrays nums1 and nums2, where
// nums1 is a subset of nums2.
// For each 0 <= i < nums1.length, find the index j such that nums1[i] ==
// nums2[j] and determine the next greater element of nums2[j] in nums2. If
// there is no next greater element, then the answer for this query is -1.
// Return an array ans of length nums1.length such that ans[i] is the next
// greater element as described above.