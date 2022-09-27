
// IPL 2021 - Match Day 2 : https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1
import java.util.*;

public class GFG_IPL_2021_Match_Day_2 {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        // for (int i = 0; i <= (n - k); i++) {
        // int max = Integer.MIN_VALUE;
        // for (int j = i; j < (i + k); j++) {
        // System.out.print(arr[j] + ", ");
        // max = Math.max(max, arr[j]);
        // }
        // ans.add(max);
        // System.out.println();
        // }
        int max = 0;
        for (int i = 0; i < k; i++)
            max = Math.max(max, arr[i]);
        for (int i = k; i < n + 1; i++) {
            max = Math.max(arr[i - 1], max);
            if (i - k - 1 >= 0 && max == arr[i - k - 1]) {
                max = 0;
                for (int j = i - k; j < i; j++)
                    max = Math.max(max, arr[j]);
            }
            ans.add(max);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        int n = 10;
        int k = 4;
        ArrayList<Integer> ans = max_of_subarrays(arr, n, k);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 9, K = 3
// arr[] = 1 2 3 1 4 5 2 3 6
// Output:
// 3 3 4 5 5 5 6
// Explanation:
// 1st contiguous subarray = {1 2 3} Max = 3
// 2nd contiguous subarray = {2 3 1} Max = 3
// 3rd contiguous subarray = {3 1 4} Max = 4
// 4th contiguous subarray = {1 4 5} Max = 5
// 5th contiguous subarray = {4 5 2} Max = 5
// 6th contiguous subarray = {5 2 3} Max = 5
// 7th contiguous subarray = {2 3 6} Max = 6

// Input:
// N = 10, K = 4
// arr[] = 8 5 10 7 9 4 15 12 90 13
// Output:
// 10 10 10 15 15 90 90
// Explanation:
// 1st contiguous subarray = {8 5 10 7}, Max = 10
// 2nd contiguous subarray = {5 10 7 9}, Max = 10
// 3rd contiguous subarray = {10 7 9 4}, Max = 10
// 4th contiguous subarray = {7 9 4 15}, Max = 15
// 5th contiguous subarray = {9 4 15 12}, Max = 15
// 6th contiguous subarray = {4 15 12 90}, Max = 90
// 7th contiguous subarray = {15 12 90 13}, Max = 90

// Explanation : Due to the rise of covid-19 cases in India, this year BCCI
// decided to organize knock-out matches in IPL rather than a league.
// Today is matchday 2 and it is between the most loved team Chennai Super Kings
// and the most underrated team - Punjab Kings. Stephen Fleming, the head coach
// of CSK, analyzing the batting stats of Punjab. He has stats of runs scored by
// all N players in the previous season and he wants to find the maximum score
// for each and every contiguous sub-list of size K to strategize for the game.