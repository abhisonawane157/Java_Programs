
// 387. First Unique Character in a String : https://leetcode.com/problems/first-unique-character-in-a-string/
import java.util.*;

public class LeetCode_First_Unique_Character_in_a_String {
    static int firstUniqChar(String s) {
        HashMap<String, Integer> maps = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (maps.containsKey(String.valueOf(s.charAt(i)))) {
                maps.put(String.valueOf(s.charAt(i)),
                        1 + maps.get(String.valueOf(s.charAt(i))));
            } else {
                maps.put(String.valueOf(s.charAt(i)), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (maps.get(String.valueOf(s.charAt(i))) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // String num = "leetcode";
        // String num = "loveleetcode";
        String num = "aabb";
        int ans = firstUniqChar(num);
        System.out.println(ans);
    }
}

// Output
// Input: s = "leetcode"
// Output: 0

// Input: s = "loveleetcode"
// Output: 2

// Input: s = "aabb"
// Output: -1

// Explanation: Given a string s, find the first non-repeating character in it
// and return its index. If it does not exist, return -1.