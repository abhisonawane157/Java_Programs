
// 228. Summary Ranges : https://leetcode.com/problems/summary-ranges/
import java.util.*;

public class LeetCode_Summary_Ranges {
    static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String an = "" + nums[i];
            int re = Retend(nums, i);
            System.out.println(re + "" + i + " | " + nums[re]);
            if (re != i) {
                an = an + "->" + nums[re];
                ans.add(an);
                an = "";
            } else {
                ans.add(nums[re] + "");
            }
            i = re;
        }
        return ans;
    }

    static int Retend(int[] arr, int a) {
        int size = arr.length - a;
        for (int i = a; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                System.out.println(arr[i]);
                size--;
            } else {
                return i;
            }
        }
        return size == 1 ? arr.length - 1 : a;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 3, 4, 6, 8, 9 };
        // int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7 };
        List<String> ans = summaryRanges(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]
// Explanation: The ranges are:
// [0,2] --> "0->2"
// [4,5] --> "4->5"
// [7,7] --> "7"

// Input: nums = [0,2,3,4,6,8,9]
// Output: ["0","2->4","6","8->9"]
// Explanation: The ranges are:
// [0,0] --> "0"
// [2,4] --> "2->4"
// [6,6] --> "6"
// [8,9] --> "8->9"

// Explanation : You are given a sorted unique integer array nums.
// A range [a,b] is the set of all integers from a to b (inclusive).
// Return the smallest sorted list of ranges that cover all the numbers in the
// array exactly. That is, each element of nums is covered by exactly one of the
// ranges, and there is no integer x such that x is in one of the ranges but not
// in nums.
// Each range [a,b] in the list should be output as:
// "a->b" if a != b
// "a" if a == b