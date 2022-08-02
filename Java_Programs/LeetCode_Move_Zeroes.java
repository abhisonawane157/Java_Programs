
// 283. Move Zeroes : https://leetcode.com/problems/move-zeroes/
public class LeetCode_Move_Zeroes {
    static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == 0) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 3, 12, 0, 2, 6, 4 };
        moveZeroes(arr);
    }
}

// Output
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]