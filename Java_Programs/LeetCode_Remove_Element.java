
// 27. Remove Element : https://leetcode.com/problems/remove-element/
public class LeetCode_Remove_Element {
    static int removeElement(int[] nums, int val) {
        int[] nums1 = new int[nums.length];
        nums1 = nums;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums1[i] == val) {
                nums[i] = Integer.MAX_VALUE;
            } else {
                nums[j] = nums1[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 0, 2 };
        int target = 2;
        int num = removeElement(arr, target);
        System.out.println(num);
    }
}

// Output
// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements
// of nums containing 0, 0, 1, 3, and 4.
// Note that the five elements can be returned in any order.
// It does not matter what you leave beyond the returned k (hence they are
// underscores).