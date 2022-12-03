
// 451. Sort Characters By Frequency : https://leetcode.com/problems/sort-characters-by-frequency/
import java.util.*;

public class LeetCode_Sort_Characters_By_Frequency {
    // static int max(HashMap<Character, Integer> maps) {
    // int maxx = 0;
    // for (Character key : maps.keySet())
    // maxx = Math.max(maxx, maps.get(key));
    // return maxx;
    // }

    // static String frequencySort(String s) {
    // HashMap<Character, Integer> maps = new HashMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // if (maps.containsKey(s.charAt(i)))
    // maps.put(s.charAt(i), 1 + maps.get(s.charAt(i)));
    // else
    // maps.put(s.charAt(i), 1);

    // }
    // int k = max(maps);
    // String an = "";
    // while (k >= 1) {
    // ArrayList<Character> m = new ArrayList<>();
    // for (Character key : maps.keySet()) {
    // if (maps.containsValue(k)) {
    // if (k == maps.get(key)) {
    // m.add(key);
    // }
    // }
    // }
    // an = an + ma(m, k);
    // m = new ArrayList<>();
    // k--;
    // }
    // an = an.substring(0, an.length() - 1);
    // String[] dum = an.split(",");
    // String g = "";
    // for (String element : dum) {
    // g = g + "" + (element);
    // }
    // return g;
    // }

    // static String ma(ArrayList<Character> m, int k) {
    // String temp = "";
    // Collections.sort(m);
    // for (Character element : m) {
    // temp = temp + String.valueOf(element + ",").repeat(k);
    // }
    // return temp;
    // }

    public static String fill(int length, Character c) {
        char[] data = new char[length];
        Arrays.fill(data, c);
        return new String(data);

    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int k = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), k + 1);
            if (max < map.get(s.charAt(i))) {
                max = map.get(s.charAt(i));
            }
        }
        SortedMap<Integer, String> map1 = new TreeMap<Integer, String>();
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (map1.containsKey(e.getValue())) {
                map1.put(e.getValue(), map1.get(e.getValue()) + fill(e.getValue(), e.getKey()));
            } else {
                map1.put(e.getValue(), fill(e.getValue(), e.getKey()));
            }
        }
        String str = "";
        for (Map.Entry<Integer, String> y : map1.entrySet()) {
            str = y.getValue() + str;
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "abbbaacacf";
        String ans = frequencySort(s);
        System.out.println(ans);
    }
}

// Output
// Input: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid
// answer.

// Input: s = "cccaaa"
// Output: "aaaccc"
// Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and
// "aaaccc" are valid answers.
// Note that "cacaca" is incorrect, as the same characters must be together.

// Input: s = "Aabb"
// Output: "bbAa"
// Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
// Note that 'A' and 'a' are treated as two different characters.

// Explanation : Given a string s, sort it in decreasing order based on the
// frequency of the characters. The frequency of a character is the number of
// times it appears in the string.
// Return the sorted string. If there are multiple answers, return any of them.