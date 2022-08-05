
// 1859. Sorting the Sentence : https://leetcode.com/problems/sorting-the-sentence/
import java.util.*;

public class LeetCode_Sorting_the_Sentence {
    static String sortSentence(String s) {
        String[] words = s.split(" ");
        HashMap<Integer, String> maps = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int num = Integer.parseInt(String.valueOf(words[i].charAt(words[i].length() - 1)));
            String wor = words[i].substring(0, words[i].length() - 1);
            maps.put(num, wor);
        }
        System.out.println(maps);
        String result = "";
        int i = 0;
        for (Integer key : maps.keySet()) {
            if ((i + 1) == maps.size()) {
                result = result + maps.get(key);
                i++;
            } else {
                i++;
                result = result + maps.get(key) + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // String str1 = "Myself2 Me1 I4 and3";
        String str1 = "is2 sentence4 This1 a3";
        String ans = sortSentence(str1);
        System.out.println(ans + "j");
    }
}

// Output
// Input: s = "is2 sentence4 This1 a3"
// Output: "This is a sentence"
// Explanation: Sort the words in s to their original positions "This1 is2 a3
// sentence4", then remove the numbers.

// Input: s = "Myself2 Me1 I4 and3"
// Output: "Me Myself and I"
// Explanation: Sort the words in s to their original positions "Me1 Myself2
// and3 I4", then remove the numbers.

// Explanation : A sentence is a list of words that are separated by a single
// space with no leading or trailing spaces. Each word consists of lowercase and
// uppercase English letters.
// A sentence can be shuffled by appending the 1-indexed word position to each
// word then rearranging the words in the sentence.
// For example, the sentence "This is a sentence" can be shuffled as "sentence4
// a3 is2 This1" or "is2 sentence4 This1 a3".
// Given a shuffled sentence s containing no more than 9 words, reconstruct and
// return the original sentence.