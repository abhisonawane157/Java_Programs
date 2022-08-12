
// 2164. Sort Even and Odd Indices Independently : https://leetcode.com/problems/sort-even-and-odd-indices-independently/
import java.util.*;

public class LeetCode_Sort_Even_and_Odd_Indices_Independently {
    static int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even);
        System.out.println(odd);
        int ieven = 0;
        int iodd = odd.size() - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                nums[i] = odd.get(iodd);
                iodd--;
            } else {
                nums[i] = even.get(ieven);
                ieven++;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = { 36, 45, 32, 31, 15, 41, 9, 46, 36, 6, 15, 16, 33, 26, 27, 31,
                44, 34 };
        // int[] nums = { 2, 1 };
        // int[] nums = { 4, 1, 2, 3 };
        int[] ans = sortEvenOdd(nums);
        System.out.println(Arrays.toString(ans));

    }
}

// Output
// Input: nums = [4,1,2,3]
// Output: [2,3,4,1]
// Explanation:
// First, we sort the values present at odd indices (1 and 3) in non-increasing
// order.
// So, nums changes from [4,1,2,3] to [4,3,2,1].
// Next, we sort the values present at even indices (0 and 2) in non-decreasing
// order.
// So, nums changes from [4,1,2,3] to [2,3,4,1].
// Thus, the array formed after rearranging the values is [2,3,4,1].

// Input: nums = [2,1]
// Output: [2,1]
// Explanation:
// Since there is exactly one odd index and one even index, no rearrangement of
// values takes place.
// The resultant array formed is [2,1], which is the same as the initial array.

// Explanation : You are given a 0-indexed integer array nums. Rearrange the
// values of nums according to the following rules:
// Sort the values at odd indices of nums in non-increasing order.
// For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1]
// after. The values at odd indices 1 and 3 are sorted in non-increasing order.
// Sort the values at even indices of nums in non-decreasing order.
// For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3]
// after. The values at even indices 0 and 2 are sorted in non-decreasing order.
// Return the array formed after rearranging the values of nums.