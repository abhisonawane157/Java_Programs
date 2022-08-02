
// 169. Majority Element : https://leetcode.com/problems/majority-element/submissions/
import java.util.*;

public class LeetCode_Majority_Element {
    static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            if (maps.containsKey(num)) {
                maps.put(num, 1 + maps.get(num));
            } else {
                maps.put(num, 1);
            }
        }
        for (Integer key : maps.keySet()) {
            if (maps.get(key) > (nums.length / 2)) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
// Explanation: Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You
// may assume that the majority element always exists in the array.
