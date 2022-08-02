
// 169. Majority Element : https://leetcode.com/problems/majority-element/submissions/
import java.util.*;

public class LeetCode_Valid_Anagram {
    static boolean isAnagram(String str1, String str2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (map.containsKey(String.valueOf(str1.charAt(i)))) {
                    map.put(String.valueOf(str1.charAt(i)), 1 + map.get(String.valueOf(str1.charAt(i))));
                } else {
                    map.put(String.valueOf(str1.charAt(i)), 1);
                }
            }
            for (int i = 0; i < str2.length(); i++) {
                if (map1.containsKey(String.valueOf(str2.charAt(i)))) {
                    map1.put(String.valueOf(str2.charAt(i)), 1 + map1.get(String.valueOf(str2.charAt(i))));
                } else {
                    map1.put(String.valueOf(str2.charAt(i)), 1);
                }
            }
        } else {
            return false;
        }
        return map.equals(map1);
    }

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "ab";
        if (isAnagram(str1, str2))
            System.out.println("true");
        else
            System.out.println("false");

    }
}

// Output
// Input: s = "anagram", t = "nagaram"
// Output: true