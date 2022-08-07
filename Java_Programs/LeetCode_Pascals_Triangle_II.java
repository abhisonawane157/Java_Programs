
// 119. Pascal's Triangle II : https://leetcode.com/problems/pascals-triangle-ii/
import java.util.*;

public class LeetCode_Pascals_Triangle_II {
    static List<Integer> getRow(int rowIndex) {
        List<Integer> ro = new ArrayList<>();
        ro.add(1);
        for (int i = 0; i < rowIndex; i++) {
            // arr.add(ro);
            ro = generate(ro);
            // System.out.println("----");
        }
        return ro;
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
        int numRows = 3;
        List<Integer> list = getRow(numRows);
        System.out.println(list.toString());
    }
}

// Output
// Input: rowIndex = 3
// Output: [1,3,3,1]

// Input: rowIndex = 0
// Output: [1]

// Input: rowIndex = 1
// Output: [1,1]

// Explanation : Given an integer rowIndex, return the rowIndexth (0-indexed)
// row of the Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly
// above it as shown:
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1