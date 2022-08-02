
// 136. Single Number : https://leetcode.com/problems/single-number/
import java.util.HashMap;

public class LeetCode_Single_Number {
    static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            if (maps.containsKey(num)) {
                maps.put(num, 1 + maps.get(num));
            } else {
                maps.put(num, 1);
            }
        }
        for (Integer key : maps.keySet()) {
            if (maps.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int ans = singleNumber(arr);
        System.out.println(ans);
    }

}

// Output
// Input: nums = [4,1,2,1,2]
// Output: 4
// Explanation: Given a non-empty array of integers nums,
// every element appears twice except for one. Find that single one. You must
// implement a solution with a linear runtime complexity and use only constant
// extra space.
