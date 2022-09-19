
// 1528. Shuffle String : https://leetcode.com/problems/shuffle-string/
import java.util.*;

public class LeetCode_Shuffle_String {
    static String restoreString(String s, int[] indices) {
        String ans = "";
        TreeMap<Integer, String> maps = new TreeMap<>();
        for (int i = 0; i < indices.length; i++) {
            maps.put(indices[i], s.charAt(i) + "");
        }
        System.out.println(maps);
        for (Integer key : maps.keySet())
            ans = ans + maps.get(key);
        return ans;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String ans = restoreString(s, indices);
        System.out.println(ans);
    }
}

// Output
// 4 5 6 7 0 2 1 3
// c o d e l e e t

// 0 1 2 3 4 5 6 7
// l e e t c o d e
// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
// Output: "leetcode"
// Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

// 0 1 2
// a b c

// a b c
// 0 1 2
// Input: s = "abc", indices = [0,1,2]
// Output: "abc"
// Explanation: After shuffling, each character remains in its position.

// Explanation : You are given a string s and an integer array indices of the
// same length. The string s will be shuffled such that the character at the ith
// position moves to indices[i] in the shuffled string.
// Return the shuffled string.