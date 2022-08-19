
// 2239. Find Closest Number to Zero : https://leetcode.com/problems/find-closest-number-to-zero/
import java.util.*;

public class LeetCode_Find_Closest_Number_to_Zero {
    static int findClosestNumber(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        int a = minPositive(nums);
        int b = minNegative(nums);
        System.out.println(a + " " + b);
        if (Math.abs(a) == Math.abs(b)) {
            return a;
        } else {
            if (Math.abs(a) < Math.abs(b))
                return a;
            else
                return b;
        }
    }

    static int minPositive(int[] nums) {
        Arrays.sort(nums);
        int min = nums[nums.length - 1];
        for (int num : nums) {
            if (num >= 0) {
                min = Math.min(min, num);
            }
        }
        return min;
    }

    static int minNegative(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        for (int num : nums) {
            if (num < 0) {
                min = Math.max(min, num);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, -1, 1 };
        // int[] nums = { -100000, -100000 };
        int[] nums = { -4, -2, 1, 4, 8 };
        int ans = findClosestNumber(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [-4,-2,1,4,8]
// Output: 1
// Explanation:
// The distance from -4 to 0 is |-4| = 4.
// The distance from -2 to 0 is |-2| = 2.
// The distance from 1 to 0 is |1| = 1.
// The distance from 4 to 0 is |4| = 4.
// The distance from 8 to 0 is |8| = 8.
// Thus, the closest number to 0 in the array is 1.

// Input: nums = [2,-1,1]
// Output: 1
// Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is
// returned
// Explanation : Given an integer array nums of size n, return the number with
// the value closest to 0 in nums. If there are multiple answers, return the
// number with the largest value.