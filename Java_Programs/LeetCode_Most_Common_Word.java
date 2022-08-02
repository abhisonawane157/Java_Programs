
// 819. Most Common Word : https://leetcode.com/problems/most-common-word/
import java.util.HashMap;

public class LeetCode_Most_Common_Word {
    static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split("[\\s,]+");
        String[] arr = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            arr[i] = words[i].toLowerCase().replaceAll("\\p{Punct}", "");
        }
        int max = Integer.MIN_VALUE;
        String result = "";
        HashMap<String, Integer> maps = new HashMap<>();
        for (String element : arr) {
            int count = 0;
            for (String element2 : banned) {
                if (element.equals(element2)) {
                    count++;
                }
            }
            if (count == 0) {
                if (maps.containsKey(element)) {
                    maps.put(element, 1 + maps.get(element));
                    if (max < 1 + maps.get(element)) {
                        max = 1 + maps.get(element);
                        result = element;
                    }
                } else {
                    maps.put(element, 1);
                }
            }
        }
        System.out.println(maps);
        result = max(maps);
        return result;
    }

    static String max(HashMap<String, Integer> maps) {
        String result = "";
        int max = Integer.MIN_VALUE;
        for (String key : maps.keySet()) {
            if (maps.get(key) > max) {
                max = maps.get(key);
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
        // String[] banned = { "hit", "ball" };
        // String str = "a.";
        // String[] banned = {};
        String str = "a, a, a, a, b,b,b,c, c";
        String[] banned = { "a" };
        String ans = mostCommonWord(str, banned);
        System.out.println(ans);
    }
}

// Output:
// Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.",
// banned = ["hit"]
// Output: "ball"
// Explanation:
// "hit" occurs 3 times, but it is a banned word.
// "ball" occurs twice (and no other word does), so it is the most frequent
// non-banned word in the paragraph.
// Note that words in the paragraph are not case sensitive,
// that punctuation is ignored (even if adjacent to words, such as "ball,"),
// and that "hit" isn't the answer even though it occurs more because it is
// banned.

// Input: paragraph = "a.", banned = []
// Output: "a"

// Explanation: Given a string paragraph and a string array of the banned words
// banned, return the most frequent word that is not banned. It is guaranteed
// there is at least one word that is not banned, and that the answer is unique.
// The words in paragraph are case-insensitive and the answer should be returned
// in lowercase.