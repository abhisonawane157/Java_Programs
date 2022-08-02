
// 2016. Maximum Difference Between Increasing Elements : https://leetcode.com/problems/maximum-difference-between-increasing-elements/
public class LeetCode_Maximum_Difference_Between_Increasing_Elements {

    static int maximumDifference(int[] nums) {
        if (nums == null || nums.length <= 1)
            return 0;
        int prof = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (prof < (nums[j] - nums[i])) {
                    prof = nums[j] - nums[i];
                }
            }
        }
        if (prof == 0)
            return -1;
        else
            return prof;
    }

    public static void main(String[] args) {
        // int[] nums = { 7, 1, 5, 4 };
        // int[] nums = { 7, 6, 4, 4, 1 };
        int[] nums = { 999, 997, 980, 976, 948, 940, 938, 928, 924, 917, 907, 907,
                881, 878, 864, 862, 859, 857, 848,
                840, 824, 824, 824, 805, 802, 798, 788, 777, 775, 766, 755, 748, 735, 732,
                727, 705, 700, 697, 693, 679,
                676, 644, 634, 624, 599, 596, 588, 583, 562, 558, 553, 539, 537, 536, 509,
                491, 485, 483, 454, 449, 438,
                425, 403, 368, 345, 327, 287, 285, 270, 263, 255, 248, 235, 234, 224, 221,
                201, 189, 187, 183, 179, 168,
                155, 153, 150, 144, 107, 102, 102, 87, 80, 57, 55, 49, 48, 45, 26, 26, 23, 15
        };
        int ans = maximumDifference(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [7,1,5,4]
// Output: 4
// Explanation:
// The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1
// = 4.
// Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6,
// but i > j, so it is not valid.

// Input: nums = [9,4,3,2]
// Output: -1
// Explanation:
// There is no i and j such that i < j and nums[i] < nums[j].