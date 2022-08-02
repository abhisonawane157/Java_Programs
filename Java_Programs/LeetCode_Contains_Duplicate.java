
// 217. Contains Duplicate : https://leetcode.com/problems/contains-duplicate/
import java.util.*;

public class LeetCode_Contains_Duplicate {
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }

        }
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j])
        // return true;
        // }
        // }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        int[] nums = { 1, 2, 3, 4 };
        // int[] nums = { 1, 2, 3, 1 };
        if (containsDuplicate(nums))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

// Output
// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

// Input: nums = [1,2,3,4]
// Output: false

// Explanation: Given an integer array nums, return true if any value appears at
// least twice in the array, and return false if every element is distinct.