
// 485. Max Consecutive Ones : https://leetcode.com/problems/max-consecutive-ones/
public class LeetCode_Max_Consecutive_Ones {
    static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1)
            if (nums[0] == 0)
                return 0;
            else
                return 1;
        int counter = 0;
        int maxcounter = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > maxcounter)
                maxcounter = counter;
            i++;
        }
        return maxcounter;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        // int[] nums = { 0, 0 };
        // int[] nums = { 1, 0, 1, 1, 0, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive
// 1s. The maximum number of consecutive 1s is 3.

// Input: nums = [1,0,1,1,0,1]
// Output: 2

// Explanation: Given a binary array nums, return the maximum number of
// consecutive 1's in the array.