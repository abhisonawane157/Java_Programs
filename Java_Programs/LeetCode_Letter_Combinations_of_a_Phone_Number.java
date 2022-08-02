
// 17. Letter Combinations of a Phone Number : https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.*;

public class LeetCode_Letter_Combinations_of_a_Phone_Number {

    static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0)
            return list;
        HashMap<Integer, String> maps = new HashMap<>();
        // maps.put(0, "_");
        // maps.put(1, "_");
        maps.put(2, "abc");
        maps.put(3, "def");
        maps.put(4, "ghi");
        maps.put(5, "jkl");
        maps.put(6, "mno");
        maps.put(7, "pqrs");
        maps.put(8, "tuv");
        maps.put(9, "wxyz");

        int size = 1;
        for (int i = 0; i < digits.length(); i++) {
            size = maps.get(Integer.parseInt(String.valueOf(digits.charAt(i)))).length() * size;
        }
        String str1, str2, str3, str4 = "";
        if (digits.length() == 1) {
            str1 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(0))));
            for (int i = 0; i < str1.length(); i++) {
                list.add(String.valueOf(str1.charAt(i)));
            }

        } else if (digits.length() == 2) {
            str1 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(0))));
            str2 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(1))));
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    list.add(String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(j)));
                }
            }
        } else if (digits.length() == 3) {
            str1 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(0))));
            str2 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(1))));
            str3 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(2))));
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    for (int k = 0; k < str3.length(); k++) {
                        list.add(String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(j))
                                + String.valueOf(str3.charAt(k)));
                    }
                }
            }
        } else if (digits.length() == 4) {
            str1 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(0))));
            str2 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(1))));
            str3 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(2))));
            str4 = maps.get(Integer.parseInt(String.valueOf(digits.charAt(3))));
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    for (int k = 0; k < str3.length(); k++) {
                        for (int l = 0; l < str4.length(); l++) {
                            list.add(String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(j))
                                    + String.valueOf(str3.charAt(k)) + String.valueOf(str4.charAt(l)));
                        }

                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String str = "234";
        List<String> ans = letterCombinations(str);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

// Output
// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

// Input: digits = ""
// Output: []

// Input: digits = "2"
// Output: ["a","b","c"]

// Constraints:
// 0 <= digits.length <= 4
// digits[i] is a digit in the range ['2', '9'].

// Explanation: Given a string containing digits from 2-9 inclusive, return all
// possible letter combinations that the number could represent. Return the
// answer in any order.

// A mapping of digits to letters (just like on the telephone buttons) is given
// below. Note that 1 does not map to any letters.

// 1|____ 2|abc 3|def
// 4|ghi 5|jkl 6|mno
// 7|pqrs 8|tuv 9|wxyz