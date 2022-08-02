
// 26. Remove Duplicates from Sorted Array : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
import java.util.*;

public class LeetCode_Remove_Duplicates_Array {
    static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            maps.put(num, 1);
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            nums[j] = Integer.MAX_VALUE;
        }
        for (Integer key : maps.keySet()) {
            nums[i] = key;
            i++;
        }
        Arrays.sort(nums);
        return maps.size();
    }

    public static void main(String[] args) {
        int[] arr = { -3, -1, 0, 0, 0, 3, 3 };
        int num = removeDuplicates(arr);
        System.out.println(num);
    }
}

// Output
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements
// of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are
// underscores).