
// Longest Perfect Piece : https://practice.geeksforgeeks.org/problems/close-to-perfection1525/1
import java.util.*;

class GFG_Longest_Perfect_Piece {

    static int longestPerfectPiece(int[] arr, int N) {
        // code here
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int ans = 0;
        int i = 0;
        int j = 0;

        while (i < N) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            while (j < N && map.lastKey() - map.firstKey() > 1) {
                map.put(arr[j], map.get(arr[j]) - 1);
                if (map.get(arr[j]) <= 0) {
                    map.remove(arr[j]);
                }
                j++;
            }
            ans = Math.max(ans, i - j + 1);
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 8, 8, 8 };
        int N = arr.length;
        int ans = longestPerfectPiece(arr, N);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 4
// arr[] = {8, 8, 8, 8}
// Output:
// 4
// Explanation:
// The longest subarray is [1, 4]
// where maximum=8 and minimum = 8 and
// difference is 0, which is less than 1.
// Its length is 4.

// Input:
// N = 11
// arr[] = {5, 4, 5, 5, 6, 7, 8, 8, 8, 7, 6}
// Output:
// 5
// Explanation:
// The longest subarray is [6, 10]
// where maximum=8 and minimum = 7 and
// difference is 1. Its length is 5.

// Explanation : Given an array arr[] of N Numbers. A Perfect Piece is defined
// as a subarray such that the difference between the minimum and the maximum
// value in that range is at most 1. Find the Maximal Length Perfect Piece.