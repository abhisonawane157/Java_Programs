
// 1. Two Sum : https://leetcode.com/problems/two-sum/

import java.util.*;

class Main {
    public static int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        // int se = 0;
        // for (int j = i + 1; j < nums.length; j++) {
        // se = nums[i] + nums[j];
        // if (target == se) {
        // return new int[] { i, j };
        // }
        // }
        // }
        int[] result = new int[2];
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (maps.containsKey(target - nums[i])) {
                result[0] = maps.get(target - nums[i]);
                result[1] = i;
                return result;
            } else {
                maps.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter " + size + " elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter sum: ");
        int summ = sc.nextInt();
        int[] result = twoSum(arr, summ);
        if (result[0] == -1)
            System.out.println("No match found");
        else
            System.out.println(result[0] + " : " + result[1]);
        sc.close();
    }
}

// Output
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Input: nums = [3,3], target = 6
// Output: [0,1]

// Explanation : Given an array of integers nums and an integer target, return
// indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may
// not use the same element twice.
// You can return the answer in any order.