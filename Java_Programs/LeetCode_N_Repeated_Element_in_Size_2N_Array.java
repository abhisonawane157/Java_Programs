
// 961. N-Repeated Element in Size 2N Array : https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
import java.util.*;

public class LeetCode_N_Repeated_Element_in_Size_2N_Array {

    static int repeatedNTimes(int[] nums) {
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                return nums[i];
            } else {
                list.add(nums[i]);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 3 };
        int[] nums = { 2, 1, 2, 5, 3, 2 };
        int ans = repeatedNTimes(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,2,3,3]
// Output: 3

// Input: nums = [2,1,2,5,3,2]
// Output: 2

// Input: nums = [5,1,5,2,5,3,5,4]
// Output: 5

// Explanation: You are given an integer array nums with the following
// properties:

// nums.length == 2 * n.
// nums contains n + 1 unique elements.
// Exactly one element of nums is repeated n times.
// Return the element that is repeated n times.