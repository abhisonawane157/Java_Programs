
// 1748. Sum of Unique Elements : https://leetcode.com/problems/sum-of-unique-elements/
import java.util.*;

public class LeetCode_Sum_of_Unique_Elements {
    static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            if (maps.containsKey(num))
                maps.put(num, 1 + maps.get(num));
            else
                maps.put(num, 1);
        }
        int sum = 0;
        for (Integer key : maps.keySet()) {
            if (maps.get(key) == 1) {
                sum = sum + key;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 2 };
        int[] nums = { 1, 2, 3, 4, 5 };
        int ans = sumOfUnique(nums);
        System.out.println((ans));
    }
}

// Output
// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.

// Input: nums = [1,1,1,1,1]
// Output: 0
// Explanation: There are no unique elements, and the sum is 0.

// Input: nums = [1,2,3,4,5]
// Output: 15
// Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

// Explanation : You are given an integer array nums. The unique elements of an
// array are the elements that appear exactly once in the array.
// Return the sum of all the unique elements of nums.