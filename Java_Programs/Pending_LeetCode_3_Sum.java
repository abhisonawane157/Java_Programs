
// 15. 3Sum : https://leetcode.com/problems/3sum/
import java.util.*;

class Pending_LeetCode_3_Sum {
    static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        arrlist = new ArrayList<>();
                        // System.out.println(arr[i] + " || " + arr[j] + " || " + arr[k]);
                        arrlist.add(arr[i]);
                        arrlist.add(arr[j]);
                        arrlist.add(arr[k]);
                        Collections.sort(arrlist);
                        if (!list.contains(arrlist))
                            list.add(arrlist);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> list = threeSum(arr);
        System.out.println(list.toString());
    }
}
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation:
// nums[0] + nums[1] + nums[1] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not
// matter.

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.

// Explanation : Given an integer array nums, return all the triplets [nums[i],
// nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j]
// + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.