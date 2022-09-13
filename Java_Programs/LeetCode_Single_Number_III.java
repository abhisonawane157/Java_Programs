
// 260. Single Number III : https://leetcode.com/problems/single-number-iii/
import java.util.*;

public class LeetCode_Single_Number_III {
    static int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        // int count = 0;
        // int k = 0;
        // for (int i = 0; i < nums.length; i++) {
        // count = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (i != j) {
        // if (nums[i] == nums[j]) {
        // break;
        // } else {
        // count++;
        // }
        // }
        // }
        // if (count == nums.length - 1) {
        // ans[k] = nums[i];
        // k++;
        // }
        // }
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (maps.containsKey(nums[i]))
                maps.put(nums[i], 1 + maps.get(nums[i]));
            else
                maps.put(nums[i], 1);
        }
        int k = 0;
        for (Integer key : maps.keySet()) {
            if (maps.get(key) == 1) {
                ans[k] = key;
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 5 };
        int[] ans = singleNumber(nums);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation: [5, 3] is also a valid answer.

// Input: nums = [-1,0]
// Output: [-1,0]

// Input: nums = [0,1]
// Output: [1,0]

// Explanation : Given an integer array nums, in which exactly two elements
// appear only once and all the other elements appear exactly twice. Find the
// two elements that appear only once. You can return the answer in any order.
// You must write an algorithm that runs in linear runtime complexity and uses
// only constant extra space.