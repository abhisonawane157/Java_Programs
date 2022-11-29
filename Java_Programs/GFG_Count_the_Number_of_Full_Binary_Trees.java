
// Count the Number of Full Binary Trees : https://practice.geeksforgeeks.org/problems/count-the-number-of-full-binary-trees2525/1

import java.util.*;

class GFG_Count_the_Number_of_Full_Binary_Trees {
    public static int numoffbt(int arr[], int n) {
        // Your code goes here
        int maxvalue = Integer.MIN_VALUE;
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            maxvalue = Math.max(maxvalue, arr[i]);
            minvalue = Math.min(minvalue, arr[i]);
        }
        int mark[] = new int[maxvalue + 2];
        int value[] = new int[maxvalue + 2];
        Arrays.fill(mark, 0);
        Arrays.fill(value, 0);
        for (int i = 0; i < n; i++) {
            mark[arr[i]] = 1;
            value[arr[i]] = 1;
        }
        int ans = 0;
        for (int i = minvalue; i <= maxvalue; i++) {
            if (mark[i] != 0) {
                for (int j = i + i; j <= maxvalue && j / i <= i; j += i) {
                    if (mark[j] == 0)
                        continue;
                    value[j] = value[j] + (value[i]
                            * value[j / i]);
                    if (i != j / i)
                        value[j] = value[j] + (value[i]
                                * value[j / i]);
                }
            }
            ans += value[i] % 1000000007;
        }
        return ans % 1000000007;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6 };
        int n = arr.length;
        int ans = numoffbt(arr, n);
        System.out.println(ans);
    }
}

// Output
// Input:
// n = 4
// arr[] = {2, 3, 4, 6}
// Output:
// 7
// Explanation:
// There are 7 full binary tree with
// the given product property.
// Four trees with single nodes
// 2 3 4 6
// Three trees with three nodes
// 4
// / \
// 2 2 ,
// 6
// / \
// 2 3 ,
// 6
// / \
// 3 2

// Input:
// n = 3
// arr[] = {2, 4, 5}
// Output: 4
// Explanation: There are 4 full binary tree
// with the given product property.
// Three trees with single nodes 2 4 5
// One tree with three nodes
// 4
// / \
// 2 2

// Explanation : Given an array arr[] of n integers, where each integer is
// greater than 1. The task is to find the number of Full binary tree from the
// given integers, such that each non-leaf node value is the product of its
// children value.

// Note: Each integer can be used multiple times in a full binary tree. The
// answer can be large, return answer modulo 1000000007