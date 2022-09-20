
// 1464. Maximum Product of Two Elements in an Array : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class LeetCode_Maximum_Product_of_Two_Elements_in_an_Array {

    static int maxProduct(int[] nums) {
        // int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (((nums[i] - 1) * (nums[j] - 1)) > max) {
                        max = (nums[i] - 1) * (nums[j] - 1);
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 7 };
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [3,4,5,2]
// Output: 12
// Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will
// get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 =
// 12.

// Input: nums = [1,5,4,5]
// Output: 16
// Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get
// the maximum value of (5-1)*(5-1) = 16.

// Input: nums = [3,7]
// Output: 12

// Explanation : Given the array of integers nums, you will choose two different
// indices i and j of that array. Return the maximum value of
// (nums[i]-1)*(nums[j]-1).