
// 2404. Most Frequent Even Element : https://leetcode.com/problems/most-frequent-even-element/
import java.util.*;

public class LeetCode_Most_Frequent_Even_Element {
    static int mostFrequentEven(int[] nums) {
        int max = 1;
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                if (maps.containsKey(num)) {
                    maps.put(num, 1 + maps.get(num));
                    max = Math.max(max, maps.get(num));
                } else {
                    maps.put(num, 1);
                }
            }
        }
        if (maps.size() == 0)
            return -1;
        int ans = Integer.MAX_VALUE;
        System.out.println(maps + " | " + max);
        for (Integer key : maps.keySet()) {
            if (maps.get(key) == max) {
                ans = Math.min(ans, key);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] nums = { 4, 4, 4, 9, 2, 4 };
        int[] nums = { 10000 };
        // int[] nums = { 0, 1, 2, 2, 4, 4, 1 };
        int ans = mostFrequentEven(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [0,1,2,2,4,4,1]
// Output: 2
// Explanation:
// The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
// We return the smallest one, which is 2.

// Input: nums = [4,4,4,9,2,4]
// Output: 4
// Explanation: 4 is the even element appears the most.

// Input: nums = [29,47,21,41,13,37,25,7]
// Output: -1
// Explanation: There is no even element.

// Explanation : Given an integer array nums, return the most frequent even
// element.
// If there is a tie, return the smallest one. If there is no such element,
// return -1.