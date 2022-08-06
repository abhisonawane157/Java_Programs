
// 219. Contains Duplicate II : https://leetcode.com/problems/contains-duplicate-ii/
import java.util.*;

public class LeetCode_Contains_Duplicate_II {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 1 };
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        if (containsNearbyDuplicate(nums, k))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: nums = [1,2,3,1], k = 3
// Output: true

// Input: nums = [1,0,1,1], k = 1
// Output: true

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

// Explanation : Given an integer array nums and an integer k, return true if
// there are two distinct indices i and j in the array such that nums[i] ==
// nums[j] and abs(i - j) <= k.