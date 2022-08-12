// 1512. Number of Good Pairs : https://leetcode.com/problems/number-of-good-pairs/

public class LeetCode_Number_of_Good_Pairs {
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.

// Input: nums = [1,2,3]
// Output: 0

// Explanation : Given an array of integers nums, return the number of good
// pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.