
// 1051. Height Checker : https://leetcode.com/problems/height-checker/
import java.util.*;

public class LeetCode_Height_Checker {
    static int heightChecker(int[] heights) {
        int[] w = new int[heights.length];
        w = heights.clone();
        System.out.println(Arrays.toString(w));
        w = insertionsort(w);
        System.out.println(Arrays.toString(w));
        int count = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i] != heights[i])
                count++;
        }
        return count;
    }

    static int[] insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] heights = { 5, 1, 2, 3, 4 };
        int ans = heightChecker(heights);
        System.out.println(ans);
    }
}

// Input: heights = [1,1,4,2,1,3]
// Output: 3
// Explanation:
// heights: [1,1,4,2,1,3]
// expected: [1,1,1,2,3,4]
// Indices 2, 4, and 5 do not match.

// Input: heights = [5,1,2,3,4]
// Output: 5
// Explanation:
// heights: [5,1,2,3,4]
// expected: [1,2,3,4,5]
// All indices do not match.

// Input: heights = [1,2,3,4,5]
// Output: 0
// Explanation:
// heights: [1,2,3,4,5]
// expected: [1,2,3,4,5]
// All indices match.

// Explanation : A school is trying to take an annual photo of all the students.
// The students are asked to stand in a single file line in non-decreasing order
// by height. Let this ordering be represented by the integer array expected
// where expected[i] is the expected height of the ith student in line.
// You are given an integer array heights representing the current order that
// the students are standing in. Each heights[i] is the height of the ith
// student in line (0-indexed).
// Return the number of indices where heights[i] != expected[i].