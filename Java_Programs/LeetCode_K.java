import java.util.*;

//wrong
public class LeetCode_K {
    static int longestPalindrome(String s) {
        HashMap<String, Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            maps.put(s.charAt(i) + "", maps.getOrDefault(s.charAt(i) + "", 0) + 1);
        }
        int count = 0;
        int ones = 1;
        System.out.println(maps);
        if (maps.size() == 1)
            return maps.get(s.charAt(0) + "");
        for (String key : maps.keySet()) {
            if (ones != 0) {
                if (maps.get(key) == 1) {
                    ones--;
                    count++;
                }
            }
            if (maps.get(key) % 2 == 0) {
                count += maps.get(key);
            } else {
                maps.put(key, maps.get(key) - 2);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "bananas";
        int ans = longestPalindrome(s);
        System.out.println(ans);
    }
}
