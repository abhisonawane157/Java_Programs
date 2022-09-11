
// 229. Majority Element II : https://leetcode.com/problems/majority-element-ii/
import java.util.*;

public class LeetCode_Majority_Element_II {
    static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            if (maps.containsKey(num))
                maps.put(num, 1 + maps.get(num));
            else
                maps.put(num, 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (Integer key : maps.keySet()) {
            if (maps.get(key) > (nums.length / 3)) {
                ans.add(key);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        List<Integer> ans = majorityElement(nums);
        System.out.println(ans);

    }
}

// Output
// Input: nums = [3,2,3]
// Output: [3]

// Input: nums = [1]
// Output: [1]

// Input: nums = [1,2]
// Output: [1,2]

// Explanation : Given an integer array of size n, find all elements that appear
// more than ⌊ n/3 ⌋ times.