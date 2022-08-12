
// 349. Intersection of Two Arrays : https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.*;

public class LeetCode_Intersection_of_Two_Arrays {
    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !(list.contains(nums1[i]))) {
                    list.add(nums1[i]);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

// Explanation : Given two integer arrays nums1 and nums2, return an array of
// their intersection. Each element in the result must be unique and you may
// return the result in any order.
