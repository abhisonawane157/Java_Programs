
// 390. Elimination Game : https://leetcode.com/problems/elimination-game/
import java.util.*;

public class LeetCode_Elimination_Game {
    static int lastRemaining(int n) {
        if (n == 1)
            return n;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        System.out.println(Arrays.toString(a) + "-true");
        return last(a, true);
        // int step = 1, head = 1;
        // boolean left = true;
        // while (n > 1) {
        // if (left || n % 2 == 1) {
        // head += step;
        // }
        // step *= 2;
        // n /= 2;
        // left = !left;
        // }
        // return head;
    }

    static int last(int[] arr, boolean flag) {
        if (arr.length == 1)
            return arr[0];
        int[] a = new int[arr.length / 2];
        int i = 0, j = 0;
        if (flag == true) {
            // i = arr.length - 1;
            while (i < arr.length) {
                if (i % 2 != 0) {
                    a[j] = arr[i];
                    j++;
                }
                i++;
                // System.out.println(Arrays.toString(a) + "-" + flag);
            }
        } else {
            i = 0;
            while (i < arr.length && j < a.length) {
                if (i % 2 == 0) {
                    a[j] = arr[i];
                    j++;
                }
                i++;
                // System.out.println(Arrays.toString(a) + "-" + flag);
            }
        }
        System.out.println(Arrays.toString(a) + "-" + !flag);
        return last(a, !flag);
    }
    // static int last(int[] arr, boolean flag) {
    // if (arr.length == 1)
    // return arr[0];
    // int i = 0;
    // int j = 0;
    // int[] a = new int[(arr.length / 2)];
    // while (i < arr.length && j < a.length) {
    // if (flag == false) {
    // // false - odd
    // if (i % 2 == 0) {
    // a[j] = arr[i];
    // j++;
    // }
    // } else {
    // // true - even
    // if (i % 2 != 0) {
    // a[j] = arr[i];
    // j++;
    // }
    // }
    // i++;
    // }
    // System.out.println(Arrays.toString(a) + "-" + flag);
    // return last(a, !flag);
    // }

    public static void main(String[] args) {
        int n = 6;
        int ans = lastRemaining(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 9
// Output: 6
// Explanation:
// arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
// arr = [2, 4, 6, 8]
// arr = [2, 6]
// arr = [6]

// Input: n = 1
// Output: 1

// Explanation : You have a list arr of all integers in the range [1, n] sorted
// in a strictly increasing order. Apply the following algorithm on arr:
// Starting from left to right, remove the first number and every other number
// afterward until you reach the end of the list.
// Repeat the previous step again, but this time from right to left, remove the
// rightmost number and every other number from the remaining numbers.
// Keep repeating the steps again, alternating left to right and right to left,
// until a single number remains.
// Given the integer n, return the last number that remains in arr.