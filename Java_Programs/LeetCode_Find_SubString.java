
// 30. Substring with Concatenation of All Words : https://leetcode.com/problems/substring-with-concatenation-of-all-words/
import java.util.*;

class LeetCode_Find_SubString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        System.out.print("Enter size of words to find: ");
        int num = sc.nextInt();
        String[] words = new String[num];
        System.out.print("Enter " + num + " words: ");
        for (int i = 0; i < num; i++) {
            words[i] = sc.next();
        }
        List<Integer> list = new ArrayList<Integer>();
        list = findSubstring(str, words);
        System.out.print("[ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.print("]");
        sc.close();
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        int len = words.length * words[0].length();
        List<Integer> result = new ArrayList<>();
        int k = words[0].length();
        HashMap<String, Integer> map = new HashMap<>();
        for (String st : words) {
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
        for (int i = 0; i + len <= s.length(); ++i) {
            HashMap<String, Integer> count = new HashMap<>();
            int c = 0;
            for (int j = i; j < i + len; j += k) {
                String word = s.substring(j, j + k);
                count.put(word, count.getOrDefault(word, 0) + 1);
                if (!map.containsKey(word) || count.get(word) > map.get(word)) {
                    break;
                }
                c += k;
            }
            if (c == len) {
                result.add(i);
            }
        }
        return result;
    }
}

// Output
// Enter String: barfoofoobarthefoobarman
// Enter size of words to find: 3
// Enter 3 words: bar
// foo
// the
// [ 6, 9, 12, ]