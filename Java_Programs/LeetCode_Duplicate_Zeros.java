
// 1089. Duplicate Zeros : https://leetcode.com/problems/duplicate-zeros/
import java.util.*;

public class LeetCode_Duplicate_Zeros {

    static void duplicateZeros(int[] arr) {
        String s = Arrays.toString(arr);
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll(" ", "");
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("0"))
                ans = ans + "00";
            else
                ans = ans + s.charAt(i);
        }
        // System.out.println(s + " " + ans.substring(0, arr.length));
        ans = ans.substring(0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(ans.charAt(i)));
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 0, 2, 3, 0, 4, 5, 0 };
        int[] nums = { 1, 2, 3 };
        duplicateZeros(nums);
    }
}

// Output
// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]
// Explanation: After calling your function, the input array is modified to:
// [1,0,0,2,3,0,0,4]

// Input: arr = [1,2,3]
// Output: [1,2,3]
// Explanation: After calling your function, the input array is modified to:
// [1,2,3]
// Explanation : Given a fixed-length integer array arr, duplicate each
// occurrence of zero, shifting the remaining elements to the right.
// Note that elements beyond the length of the original array are not written.
// Do the above modifications to the input array in place and do not return
// anything.