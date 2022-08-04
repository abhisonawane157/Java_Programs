
// 287. Find the Duplicate Number : https://leetcode.com/problems/find-the-duplicate-number/
// import java.util.HashMap;

public class LeetCode_Find_the_Duplicate_Number {

    static int findDuplicate(int[] nums) {

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
        // return key;
        // }
        // return -1;

        // Method -02
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 5 };
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,3,4,2,2]
// Output: 2

// Input: nums = [3,1,3,4,2]
// Output: 3

// Explanation: Given an array of integers nums containing n + 1 integers where
// each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only
// constant extra space.