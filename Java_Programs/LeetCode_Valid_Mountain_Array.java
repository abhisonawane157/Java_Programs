
// 941. Valid Mountain Array : https://leetcode.com/problems/valid-mountain-array/
public class LeetCode_Valid_Mountain_Array {
    static boolean validMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start + 1 < end && arr[start] < arr[start + 1])
            start++;
        if (start == 0 || start == end - 1)
            return false;
        while (start + 1 < end && arr[start] > arr[start + 1])
            start++;
        return start == end - 1;
    }

    public static void main(String[] args) {
        // int[] arr = { 0, 2, 3, 4, 5, 2, 1, 0 };
        int[] arr = { 1, 7, 9, 5, 4, 1, 2 };
        System.out.println(validMountainArray(arr));
    }
}

// Output
// Input: arr = [2,1]
// Output: false

// Input: arr = [3,5,5]
// Output: false

// Input: arr = [0,3,2,1]
// Output: true

// Explanation : Given an array of integers arr, return true if and only if it
// is a valid mountain array.
// Recall that arr is a mountain array if and only if:
// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]