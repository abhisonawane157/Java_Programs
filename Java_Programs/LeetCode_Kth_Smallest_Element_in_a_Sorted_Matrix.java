
// 378. Kth Smallest Element in a Sorted Matrix : https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
import java.util.*;

public class LeetCode_Kth_Smallest_Element_in_a_Sorted_Matrix {
    static int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] element : matrix) {
            for (int element2 : element) {
                list.add(element2);
            }
        }
        Collections.sort(list);
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 5, 9 },
                { 10, 11, 13 },
                { 12, 13, 15 }
        };
        int k = 8;
        int ans = kthSmallest(matrix, k);
        System.out.println(ans);
    }
}

// Output
// Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
// Output: 13
// Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and
// the 8th smallest number is 13

// Input: matrix = [[-5]], k = 1
// Output: -5

// Explanation : Given an n x n matrix where each of the rows and columns is
// sorted in ascending order, return the kth smallest element in the matrix.
// Note that it is the kth smallest element in the sorted order, not the kth
// distinct element.
// You must find a solution with a memory complexity better than O(n2)