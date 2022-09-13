
// 137. Single Number II : https://leetcode.com/problems/single-number-ii/
import java.util.*;

public class LeetCode_Single_Number_II {
    static int singleNumber(int[] nums) {
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
                k = key;
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 1 };
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [2,2,3,2]
// Output: 3

// Input: nums = [0,1,0,1,0,1,99]
// Output: 99

// Explanation : Given an integer array nums where every element appears three
// times except for one, which appears exactly once. Find the single element and
// return it.
// You must implement a solution with a linear runtime complexity and use only
// constant extra space.