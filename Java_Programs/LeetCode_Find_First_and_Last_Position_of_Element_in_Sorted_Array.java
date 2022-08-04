
// 34. Find First and Last Position of Element in Sorted Array : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// import java.util.HashMap;

class LeetCode_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    static int[] searchRange(int[] nums, int target) {
        // --Method -1
        // int count = 0, start = -1, end = -1;
        // HashMap<Integer, Integer> maps = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (maps.containsKey(nums[i])) {
        // maps.put(nums[i], maps.get(nums[i]) + 1);
        // } else {
        // maps.put(nums[i], 1);
        // if (nums[i] == target) {
        // start = i;
        // } else {
        // count++;
        // }
        // }
        // }
        // if (count == maps.size())
        // return new int[] { -1, -1 };
        // for (int i = start; i < nums.length; i++) {
        // if (nums[i] == target) {
        // end = i;
        // }
        // }

        // --Method -2
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] num, int target, Boolean flag) {
        int ans = -1;
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            // int mid = start + (end - start)/2;
            int mid = (end + start) / 2;
            if (num[mid] > target) {
                end = mid - 1;
            } else if (num[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (flag)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] nums = { 5, 7, 7, 8, 8, 10 };
        int[] nums = { 1, 6 };
        int target = 6;
        int[] ans = searchRange(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

// Output
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// nput: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Input: nums = [], target = 0
// Output: [-1,-1]

// Explanation: Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.