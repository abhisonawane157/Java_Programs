
// Smallest number on left : https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1
import java.util.*;

class GFG_Smallest_number_on_left {
    static List<Integer> leftSmaller(int n, int arr[]) {
        List<Integer> f = new ArrayList<>();
        int smallest = arr[0];
        for (int element : arr) {
            smallest = Math.min(smallest, element);
        }
        f.add(-1);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == smallest) {
                f.add(-1);
                continue;
            } else {
                f.add(leftSmall(arr, i));
                continue;
            }
        }
        return f;
    }

    static int leftSmall(int[] arr, int j) {
        int s = arr[j];
        for (int i = j; i >= 0; i--) {
            if (s > arr[i])
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 6;
        // int[] arr = { 1, 5, 0, 3, 4, 5 };
        int[] arr = { 9, 7, 5, 3, 2, 1 };
        // int[] arr = { 1, 6, 2 };
        List<Integer> ans = leftSmaller(n, arr);
        System.out.println(ans);
    }
}

// Output
// Input: n = 3
// a = {1, 6, 2}
// Output: -1 1 1
// Explaination: There is no number at the
// left of 1. Smaller number than 6 and 2 is 1.

// Input: n = 6
// a = {1, 5, 0, 3, 4, 5}
// Output: -1 1 -1 0 3 4
// Explaination: Upto 3 it is easy to see
// the smaller numbers. But for 4 the smaller
// numbers are 1, 0 and 3. But among them 3
// is closest. Similary for 5 it is 4.

// Explaination : Given an array a of integers of length n, find the nearest
// smaller number for every element such that the smaller element is on left
// side.If no small element present on the left print -1.