
// 350. Intersection of Two Arrays II : https://leetcode.com/problems/intersection-of-two-arrays-ii/
import java.util.*;

public class LeetCode_Intersection_of_Two_Arrays_II {
    static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    nums1[i] = Integer.MAX_VALUE;
                    nums2[j] = Integer.MIN_VALUE;
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
        // int[] nums1 = { 1, 2, 2, 1 };
        // int[] nums2 = { 2, 2 };
        int[] ans = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.

// Explanation : Given two integer arrays nums1 and nums2, return an array of
// their intersection. Each element in the result must appear as many times as
// it shows in both arrays and you may return the result in any order.