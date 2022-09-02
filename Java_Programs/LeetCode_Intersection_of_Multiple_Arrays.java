
// 2248. Intersection of Multiple Arrays : https://leetcode.com/problems/intersection-of-multiple-arrays/
import java.util.*;

public class LeetCode_Intersection_of_Multiple_Arrays {
    static List<Integer> intersection(int[][] nums) {
        List<Integer> w1 = new ArrayList<>();
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int[] num : nums) {
            for (int element : num) {
                if (maps.containsKey(element)) {
                    maps.put(element, 1 + maps.get(element));
                } else {
                    maps.put(element, 1);
                }
            }
        }
        for (Integer key : maps.keySet()) {
            if (maps.get(key) == nums.length) {
                w1.add(key);
            }
        }
        Collections.sort(w1);
        return w1;
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 7, 34, 45, 10, 12, 27, 13 },
                { 27, 21, 45, 10, 12, 13 }
                // { 4, 5, 3, 6 }
        };
        // int[][] nums = {
        // { 3, 1, 2, 4, 5 },
        // { 1, 2, 3, 4 },
        // { 3, 4, 5, 6 }
        // };
        List<Integer> ans = intersection(nums);
        System.out.println(ans);

    }
}

// Output
// Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
// Output: [3,4]
// Explanation:
// The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] =
// [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].

// Input: nums = [[1,2,3],[4,5,6]]
// Output: []
// Explanation:
// There does not exist any integer present both in nums[0] and nums[1], so we
// return an empty list [].

// Explanation : Given a 2D integer array nums where nums[i] is a non-empty
// array of distinct positive integers, return the list of integers that are
// present in each array of nums sorted in ascending order.