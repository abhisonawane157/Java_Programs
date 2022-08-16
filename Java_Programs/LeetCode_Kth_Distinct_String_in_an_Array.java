
// 2053. Kth Distinct String in an Array : https://leetcode.com/problems/kth-distinct-string-in-an-array/discuss?currentPage=1&orderBy=hot&query=
import java.util.*;

public class LeetCode_Kth_Distinct_String_in_an_Array {
    static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> maps = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (maps.containsKey(arr[i]))
                maps.put(arr[i], maps.get(arr[i]) + 1);
            else
                maps.put(arr[i], 1);
        }
        System.out.println(maps);
        for (String word : arr) {
            if (maps.get(word) == 1)
                k--;
            if (k == 0)
                return word;
        }
        return "";
    }

    public static void main(String[] args) {
        String[] arr = { "d", "b", "c", "b", "c", "a" };
        // String[] arr = { "aaa", "aa", "a" };
        int k = 2;
        String ans = kthDistinct(arr, k);
        System.out.println(ans);
    }
}

// Output
// Input: arr = ["d","b","c","b","c","a"], k = 2
// Output: "a"
// Explanation:
// The only distinct strings in arr are "d" and "a".
// "d" appears 1st, so it is the 1st distinct string.
// "a" appears 2nd, so it is the 2nd distinct string.
// Since k == 2, "a" is returned.

// Input: arr = ["aaa","aa","a"], k = 1
// Output: "aaa"
// Explanation:
// All strings in arr are distinct, so the 1st string "aaa" is returned.

// Input: arr = ["a","b","a"], k = 3
// Output: ""
// Explanation:
// The only distinct string is "b". Since there are fewer than 3 distinct
// strings, we return an empty string "".

// Explanation : A distinct string is a string that is present only once in an
// array.
// Given an array of strings arr, and an integer k, return the kth distinct
// string present in arr. If there are fewer than k distinct strings, return an
// empty string "".
// Note that the strings are considered in the order in which they appear in the
// array.