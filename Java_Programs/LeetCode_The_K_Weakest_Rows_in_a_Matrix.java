
// 1337. The K Weakest Rows in a Matrix : https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
import java.util.*;

public class LeetCode_The_K_Weakest_Rows_in_a_Matrix {
    static int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        int total = 0;
        int[] arr1 = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            total = 0;
            for (int j = 0; j < mat[0].length; j++) {
                total = total + mat[i][j];
            }
            maps.put(i, total);
            arr1[i] = total;
        }
        Arrays.sort(arr1);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = getKey(maps, arr1[i]);
            maps.remove(ans[i]);
        }
        return ans;
    }

    static int getKey(HashMap<Integer, Integer> maps, int value) {
        for (Integer key : maps.keySet()) {
            if (value == maps.get(key))
                return key;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        // int[][] mat = {
        // { 1, 1, 0, 0, 0 },
        // { 1, 1, 1, 1, 0 },
        // { 1, 0, 0, 0, 0 },
        // { 1, 1, 0, 0, 0 },
        // { 1, 1, 1, 1, 1 }
        // };
        int k = 2;
        int[] ans = kWeakestRows(mat, k);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: mat =
// [[1,1,0,0,0],
// [1,1,1,1,0],
// [1,0,0,0,0],
// [1,1,0,0,0],
// [1,1,1,1,1]],
// k = 3
// Output: [2,0,3]
// Explanation:
// The number of soldiers in each row is:
// - Row 0: 2
// - Row 1: 4
// - Row 2: 1
// - Row 3: 2
// - Row 4: 5
// The rows ordered from weakest to strongest are [2,0,3,1,4].

// Input: mat =
// [[1,0,0,0],
// [1,1,1,1],
// [1,0,0,0],
// [1,0,0,0]],
// k = 2
// Output: [0,2]
// Explanation:
// The number of soldiers in each row is:
// - Row 0: 1
// - Row 1: 4
// - Row 2: 1
// - Row 3: 1
// The rows ordered from weakest to strongest are [0,2,3,1].

// Explanation : You are given an m x n binary matrix mat of 1's (representing
// soldiers) and 0's (representing civilians). The soldiers are positioned in
// front of the civilians. That is, all the 1's will appear to the left of all
// the 0's in each row.
// A row i is weaker than a row j if one of the following is true:
// The number of soldiers in row i is less than the number of soldiers in row j.
// Both rows have the same number of soldiers and i < j.
// Return the indices of the k weakest rows in the matrix ordered from weakest
// to strongest.