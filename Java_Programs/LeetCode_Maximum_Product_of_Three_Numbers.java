
// 628. Maximum Product of Three Numbers : https://leetcode.com/problems/maximum-product-of-three-numbers/
import java.util.*;

public class LeetCode_Maximum_Product_of_Three_Numbers {
    static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

    public static void main(String[] args) {
        // int[] nums = { -100, -2, -3, 1 };
        int[] nums = { -8, 1, 2, 3, 9 };
        int ans = maximumProduct(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,2,3]
// Output: 6

// Input: nums = [1,2,3,4]
// Output: 24

// Input: nums = [-1,-2,-3]
// Output: -6

// Explanation : Given an integer array nums, find three numbers whose product
// is maximum and return the maximum product.