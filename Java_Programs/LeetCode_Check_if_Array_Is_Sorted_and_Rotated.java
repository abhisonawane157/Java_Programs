
// 1752. Check if Array Is Sorted and Rotated : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
import java.util.*;;

public class LeetCode_Check_if_Array_Is_Sorted_and_Rotated {
    static boolean check(int[] nums) {
        String a = "";
        int[] che = nums.clone();
        Arrays.sort(che);
        for (int num : nums) {
            a += num + ",";
        }
        String b = "";
        for (int element : che) {
            b += element + ",";
        }
        a = a + a;
        // System.out.println(a);
        // System.out.println(b);
        return a.contains(b);
    }

    public static void main(String[] args) {
        // int[] nums = { 11, 11, 1, 20 };
        // int[] nums = { 2, 1, 3, 4 };
        int[] nums = { 3, 4, 5, 1, 2 };
        System.out.println(check(nums));
    }
}

// Output
// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 3 positions to begin on the the element of
// value 3: [3,4,5,1,2].

// Input: nums = [2,1,3,4]
// Output: false
// Explanation: There is no sorted array once rotated that can make nums.

// Input: nums = [1,2,3]
// Output: true
// Explanation: [1,2,3] is the original sorted array.
// You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

// Explanation : Given an array nums, return true if the array was originally
// sorted in non-decreasing order, then rotated some number of positions
// (including zero). Otherwise, return false.
// There may be duplicates in the original array.
// Note: An array A rotated by x positions results in an array B of the same
// length such that A[i] == B[(i+x) % A.length], where % is the modulo
// operation.