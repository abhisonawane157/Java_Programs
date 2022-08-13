
// 989. Add to Array-Form of Integer : https://leetcode.com/problems/add-to-array-form-of-integer/
import java.math.*;
import java.util.*;

public class LeetCode_Add_to_Array_Form_of_Integer {
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        String val = "";
        for (int element : num) {
            val = val + element;
        }
        System.out.println(val);
        BigInteger first = new BigInteger(val);
        BigInteger second = new BigInteger(k + "");
        String sum = first.add(second).toString(10);
        for (int i = 0; i < sum.length(); i++) {
            ans.add(Integer.parseInt(String.valueOf(sum.charAt(i))));
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] nums = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        // int k = 2;
        int[] nums = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 };
        int k = 516;
        List<Integer> ans = addToArrayForm(nums, k);
        System.out.println(ans);
    }
}

// Output
// Input: num = [1,2,0,0], k = 34
// Output: [1,2,3,4]
// Explanation: 1200 + 34 = 1234

// Input: num = [2,7,4], k = 181
// Output: [4,5,5]
// Explanation: 274 + 181 = 455

// Input: num = [2,1,5], k = 806
// Output: [1,0,2,1]
// Explanation: 215 + 806 = 1021

// Explanation : The array-form of an integer num is an array representing its
// digits in left to right order.
// For example, for num = 1321, the array form is [1,3,2,1].
// Given num, the array-form of an integer, and an integer k, return the
// array-form of the integer num + k.