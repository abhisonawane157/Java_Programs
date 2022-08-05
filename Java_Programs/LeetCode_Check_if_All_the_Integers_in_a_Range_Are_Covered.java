
// 1893. Check if All the Integers in a Range Are Covered : https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
import java.util.*;

public class LeetCode_Check_if_All_the_Integers_in_a_Range_Are_Covered {

    static boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> a = allot(ranges);

        for (int i = left; i <= right; i++) {
            if (!a.contains(i))
                return false;
        }
        return true;
    }

    static Set<Integer> allot(int[][] ranges) {
        Set<Integer> a = new HashSet<>();
        for (int[] range : ranges) {
            // System.out.println(range[0] + " " + range[1]);
            for (int i = range[0]; i <= range[1]; i++) {
                a.add(i);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] range = {
                { 1, 2 },
                { 3, 4 },
                { 1, 50 }
        };
        int left = 1;
        int right = 50;
        if (isCovered(range, left, right))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// Output
// Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
// Output: true
// Explanation: Every integer between 2 and 5 is covered:
// - 2 is covered by the first range.
// - 3 and 4 are covered by the second range.
// - 5 is covered by the third range.

// Input: ranges = [[1,10],[10,20]], left = 21, right = 21
// Output: false
// Explanation: 21 is not covered by any range.

// Explanation : You are given a 2D integer array ranges and two integers left
// and right. Each ranges[i] = [starti, endi] represents an inclusive interval
// between starti and endi.
// Return true if each integer in the inclusive range [left, right] is covered
// by at least one interval in ranges. Return false otherwise.
// An integer x is covered by an interval ranges[i] = [starti, endi] if starti
// <= x <= endi.