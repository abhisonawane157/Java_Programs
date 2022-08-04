
// 442. Find All Duplicates in an Array : https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.*;

public class LeetCode_Find_All_Duplicates_in_an_Array {

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        // Method -01
        // HashMap<Integer, Integer> maps = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (maps.containsKey(nums[i])) {
        // maps.put(nums[i], 1 + maps.get(nums[i]));
        // } else {
        // maps.put(nums[i], 1);
        // }
        // }
        // for (Integer key : maps.keySet()) {
        // if (maps.get(key) > 1)
        // list.add(key);
        // }
        // return list;

        // Method -02
        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
                swap(nums, i, correct);
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                list.add(nums[j]);
        }
        return list;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

// Input: nums = [1,1,2]
// Output: [1]

// Input: nums = [1]
// Output: []

// Explanation: Given an integer array nums of length n where all the integers
// of nums are in the range [1, n] and each integer appears once or twice,
// return an array of all the integers that appears twice.
// You must write an algorithm that runs in O(n) time and uses only constant
// extra space.