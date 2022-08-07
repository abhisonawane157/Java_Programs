
// 118. Pascal's Triangle : https://leetcode.com/problems/pascals-triangle/
import java.util.*;

public class LeetCode_Pascals_Triangle {

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        List<Integer> ro = new ArrayList<>();
        ro.add(1);
        for (int i = 0; i < numRows; i++) {
            arr.add(ro);
            ro = generate(ro);
            // System.out.println("----");
        }
        return arr;
    }

    static List<Integer> generate(List<Integer> list) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        // System.out.println(list.size() + " " + list);
        for (int i = 0; i < list.size() - 1; i++) {
            int sum = list.get(i) + list.get(i + 1);
            arr.add(sum);
        }
        arr.add(1);
        return arr;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> list = generate(numRows);
        System.out.println(list.toString());
    }
}

// Output
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// Input: numRows = 1
// Output: [[1]]

// Explanation : Given an integer numRows, return the first numRows of Pascal's
// triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly
// above it as shown:
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1