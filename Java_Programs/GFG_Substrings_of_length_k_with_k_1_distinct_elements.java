
// Substrings of length k with k-1 distinct elements : https://practice.geeksforgeeks.org/problems/substrings-of-length-k-with-k-1-distinct-elements/1
import java.util.*;

class GFG_Substrings_of_length_k_with_k_1_distinct_elements {
    static int countOfSubstrings(String s, int k) {
        // code here
        int d = k - 1;
        Map<Character, Integer> map = new HashMap<>();
        int i = -1, j = -1;
        int n = s.length(), count = 0;
        while (j < n - 1) {
            char c = s.charAt(++j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (j - i < k) {
                continue;
            }
            if (map.size() == d) {
                count++;
            }
            char b = s.charAt(++i);
            map.put(b, map.getOrDefault(b, 0) - 1);
            if (map.get(b) == 0) {
                map.remove(b);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcc";
        int k = 2;
        int ans = countOfSubstrings(s, k);
        System.out.println(ans);
    }
}

// Output
// Input:
// S = "abcc"
// K = 2
// Output:
// 1
// Explanation:
// Possible substrings of length K = 2 are
// ab : 2 distinct characters
// bc : 2 distinct characters
// cc : 1 distinct character
// Only one valid substring exists {"cc"}.

// Input:
// S = "aabab"
// K = 3
// Output :
// 3
// Explanation:
// Possible substrings of length K = 3 are
// aab : 2 distinct characters
// aba : 2 distinct characters
// bab : 2 distinct characters.
// All of these Substrings are a possible answer,
// so the count is 3.

// Explanation : Given a String S and an integer K. Find the count of all
// substrings of length K which have exactly K-1 distinct characters.