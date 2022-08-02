
// 414. Third Maximum Number : https://leetcode.com/problems/third-maximum-number/
import java.util.Arrays;

public class LeetCode_Third_Maximum_Number {

    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] newarr = new int[nums.length];
        newarr = nums;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] == nums[i + 1]) {
                    newarr[i] = Integer.MIN_VALUE;
                } else {
                    newarr[i] = nums[i];
                }
            }
        }
        Arrays.sort(newarr);
        // for (int i = 0; i < newarr.length; i++) {
        // System.out.print(newarr[i] + " ");
        // }
        // System.out.println();
        if (newarr.length >= 3) {
            if (newarr[newarr.length - 3] == Integer.MIN_VALUE) {
                return newarr[newarr.length - 1];
            } else {
                return newarr[newarr.length - 3];
            }
        } else {
            return newarr[newarr.length - 1];
        }
        // return 0;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 2, 3, 1 };
        int[] nums = { 1, 2, -2147483648 };
        int ans = thirdMax(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.

// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned
// instead.