
// 238. Product of Array Except Self : https://leetcode.com/problems/product-of-array-except-self/
import java.util.*;

public class LeetCode_Product_of_Array_Except_Self {
    static int[] productExceptSelf(int[] arr) {
        // int[] ans = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // int mut = 1;
        // for (int j = 0; j < arr.length; j++) {
        // if (i != j) {
        // mut = mut * arr[j];
        // }
        // }
        // ans[i] = mut;
        // }
        // return ans;
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
            max = Math.max(max, left[i]);
        }
        right[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
            max = Math.max(max, right[i]);
        }
        int[] pdt = new int[arr.length];
        for (int i = 0; i < pdt.length; i++) {
            pdt[i] = left[i] * right[i];
        }
        System.out.println(max);
        return pdt;
    }

    public static void main(String[] args) {
        int[] arr = { -4, -3 };
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

// Explanation : Given an integer array nums, return an array answer such that
// answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
// integer.
// You must write an algorithm that runs in O(n) time and without using the
// division operation.