
// 977. Squares of a Sorted Array : https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.*;

public class LeetCode_Squares_of_a_Sorted_Array {
    static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        nums = insertionsort(nums);
        return nums;
    }

    static int[] insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] words = { 4, 5, 2, 1, 3 };
        int[] ans = sortedSquares(words);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

// Explanation : Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.