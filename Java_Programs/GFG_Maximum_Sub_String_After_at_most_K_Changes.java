
// Maximum Sub-String after at most K changes : https://practice.geeksforgeeks.org/problems/maximum-sub-string-after-at-most-k-changes3220/1
import java.util.*;

class GFG_Maximum_Sub_String_After_at_most_K_Changes {

    public static int characterReplacement(String s, int k) {
        // code here
        int i = 0, j = 0, max = 0, ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            max = Math.max(max, map.get(s.charAt(j)));
            if ((j - i + 1) - max > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int ans = characterReplacement(s, k);
        System.out.println(ans);
    }
}

// Output
// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Change 2 'B' into 'A'.
// Now s = "AAAA"

// Input: s = "ADBD", k = 1
// Output: 3
// Explanation: Change 'B' into 'D'.
// Now s = "ADDD"

// Explanation : We have a string s of length n, which contains only UPPERCASE
// characters and we have a number k (always less than n). We can make at most k
// changes in our string. In one change, you can replace any s[i] (0<= i < n)
// with any uppercase character (from 'A' to 'Z'). After k changes, find the
// maximum possible length of the sub-string which have all same characters.