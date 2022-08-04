
// 852. Peak Index in a Mountain Array : https://leetcode.com/problems/peak-index-in-a-mountain-array/
// import java.util.Arrays;

public class LeetCode_Peak_Index_in_a_Mountain_Array {
    static int peakIndexInMountainArray(int[] arr) {
        // --Method -1
        // int[] arr1 = new int[arr.length];
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = arr[i];
        // }
        // Arrays.sort(arr1);
        // int peak = arr1[arr1.length - 1];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // if (arr[i] == peak) {
        // // System.out.println(peak);
        // return i;
        // }
        // }
        // return 0;

        // --Method -2
        return search(arr);
    }

    static int search(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // int mid = (end + start) / 2;
            if (num[mid] > num[mid + 1]) // Descending
            {
                end = mid;
            } else { // Ascending
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0 };
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}

// Output
// Input: arr = [0,1,0]
// Output: 1

// Input: arr = [0,2,1,0]
// Output: 1

// Input: arr = [0,10,5,2]
// Output: 1

// Explanation: An array arr a mountain if the following properties hold:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array arr, return the index i such that arr[0] < arr[1] <
// ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

// You must solve it in O(log(arr.length)) time complexity.