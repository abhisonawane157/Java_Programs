
// 1299. Replace Elements with Greatest Element on Right Side : https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
import java.util.*;

public class LeetCode_Replace_Elements_with_Greatest_Element_on_Right_Side {
    static int[] replaceElements(int[] arr) {
        int[] ar = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int j = arr.length - 2;
        for (int i = arr.length - 1; i > 0; i--) {
            max = Math.max(max, arr[i]);
            ar[j] = max;
            j--;
        }
        ar[arr.length - 1] = -1;
        return ar;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        int[] ans = replaceElements(arr);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]
// Explanation:
// - index 0 --> the greatest element to the right of index 0 is index 1 (18).
// - index 1 --> the greatest element to the right of index 1 is index 4 (6).
// - index 2 --> the greatest element to the right of index 2 is index 4 (6).
// - index 3 --> the greatest element to the right of index 3 is index 4 (6).
// - index 4 --> the greatest element to the right of index 4 is index 5 (1).
// - index 5 --> there are no elements to the right of index 5, so we put -1.

// Input: arr = [400]
// Output: [-1]
// Explanation: There are no elements to the right of index 0.

// Explanation : Given an array arr, replace every element in that array with
// the greatest element among the elements to its right, and replace the last
// element with -1.
// After doing so, return the array.