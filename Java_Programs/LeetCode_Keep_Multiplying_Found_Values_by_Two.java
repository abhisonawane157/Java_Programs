
// 2154. Keep Multiplying Found Values by Two : https://leetcode.com/problems/keep-multiplying-found-values-by-two/
public class LeetCode_Keep_Multiplying_Found_Values_by_Two {
    static int findFinalValue(int[] nums, int original) {
        boolean flag = true;
        while (flag) {
            if (contains(nums, original))
                original *= 2;
            else
                flag = false;
        }
        return original;
    }

    static boolean contains(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 16, 13, 19, 12, 10 };
        int[] nums = { 5, 3, 6, 1, 12 };
        int original = 3;
        int ans = findFinalValue(nums, original);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [5,3,6,1,12], original = 3
// Output: 24
// Explanation:
// - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
// - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
// - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
// - 24 is not found in nums. Thus, 24 is returned.

// Input: nums = [2,7,9], original = 4
// Output: 4
// Explanation:
// - 4 is not found in nums. Thus, 4 is returned.

// Explanation : You are given an array of integers nums. You are also given an
// integer original which is the first number that needs to be searched for in
// nums.
// You then do the following steps:
// If original is found in nums, multiply it by two (i.e., set original = 2 *
// original).
// Otherwise, stop the process.
// Repeat this process with the new number as long as you keep finding the
// number.
// Return the final value of original.