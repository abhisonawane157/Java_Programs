
// 2215. Find the Difference of Two Arrays : https://leetcode.com/problems/find-the-difference-of-two-arrays/submissions/
import java.util.*;

public class LeetCode_Find_the_Difference_of_Two_Arrays {
    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> maps1 = new HashMap<>();
        HashMap<Integer, Integer> maps2 = new HashMap<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int element : nums1) {
            if (maps1.containsKey(element)) {
                maps1.put(element, 1 + maps1.get(element));
            } else {
                maps1.put(element, 1);
            }
        }
        for (int element : nums2) {
            if (maps2.containsKey(element)) {
                maps2.put(element, 1 + maps2.get(element));
            } else {
                maps2.put(element, 1);
            }
        }
        for (Integer key : maps1.keySet()) {
            if (!maps2.containsKey(key)) {
                a.add(key);
            }
        }
        for (Integer key : maps2.keySet()) {
            if (!maps1.containsKey(key)) {
                b.add(key);
            }
        }
        ans.add(a);
        ans.add(b);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4 };
        List<List<Integer>> ans = findDifference(nums1, nums2);
        System.out.println(ans);
    }
}

// Output
// Input: nums1 = [1,2,3], nums2 = [2,4,6]
// Output: [[1,3],[4,6]]
// Explanation:
// For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1
// and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
// For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4
// and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

// Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
// Output: [[3],[]]
// Explanation:
// For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] ==
// nums1[3], their value is only included once and answer[0] = [3].
// Every integer in nums2 is present in nums1. Therefore, answer[1] = [].

// Explanation : Given two 0-indexed integer arrays nums1 and nums2, return a
// list answer of size 2 where:
// answer[0] is a list of all distinct integers in nums1 which are not present
// in nums2.
// answer[1] is a list of all distinct integers in nums2 which are not present
// in nums1.
// Note that the integers in the lists may be returned in any order.