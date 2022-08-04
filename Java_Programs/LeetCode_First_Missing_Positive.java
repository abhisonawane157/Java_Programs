
// 41. First Missing Positive : https://leetcode.com/problems/first-missing-positive/
// import java.util.*;

public class LeetCode_First_Missing_Positive {

    static int firstMissingPositive(int[] nums) {
        // Method -01
        // int s = 0;
        // for (int num : nums) {
        // if (num == 1)
        // s++;
        // }
        // if (s == 0)
        // return 1;
        // HashMap<Integer, Integer> maps = new HashMap<>();
        // for (int num : nums) {
        // if (maps.containsKey(num)) {
        // maps.put(num, 1 + maps.get(num));
        // } else {
        // maps.put(num, 1);
        // }
        // }
        // for (int i = 1; i <= maps.size() + 1; i++) {

        // if (maps.containsKey(i)) {
        // } else {
        // return i;
        // }
        // }
        // return nums.length + 1;\

        // Method -02
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != (j + 1)) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 4, -1, 1 }; //2
        // int[] arr = { 1, 2, 0 }; //3
        // int[] arr = { 7, 8, 9, 11, 12 }; //1
        // int[] arr = { 0 }; //1
        // int[] arr = { 2, 1 }; //3
        // int[] arr = { -1, -2 }; //1
        // int[] arr = { -17, 18, 9, 11, 12 }; //1
        // int[] arr = { -1, -1, -60, 40, 43 }; //1
        // int[] arr = { 1, 1, 1, 1, 1 }; //2
        // int[] arr = { 2, 2 }; //1
        int[] arr = { 0, 2, 2, 1, 1 }; // 3
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,2,0]
// Output: 3

// Input: nums = [3,4,-1,1]
// Output: 2

// Input: nums = [7,8,9,11,12]
// Output: 1

// Explanation: Given an unsorted integer array nums, return the smallest
// missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses constant
// extra space.