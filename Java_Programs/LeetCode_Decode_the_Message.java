
// 2325. Decode the Message : https://leetcode.com/problems/decode-the-message/
import java.util.*;

public class LeetCode_Decode_the_Message {
    static String decodeMessage(String key, String message) {
        String ans = "";
        char c = 'a';
        HashMap<Character, Character> maps = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if (!maps.containsKey(key.charAt(i)) && key.charAt(i) != ' ')
                maps.put(key.charAt(i), c++);
        }
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                ans = ans + maps.get(message.charAt(i));
            } else {
                ans = ans + ' ';
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // String key = "the quick brown fox jumps over the lazy dog";
        // String message = "vkbs bs t suepuv";
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String ans = decodeMessage(key, message);
        System.out.println(ans);
    }
}

// Output
// Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs
// bs t suepuv"
// Output: "this is a secret"
// Explanation: The diagram above shows the substitution table.
// It is obtained by taking the first appearance of each letter in "the quick
// brown fox jumps over the lazy dog".

// Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius
// ycgk vcnjrdb"
// Output: "the five boxing wizards jump quickly"
// Explanation: The diagram above shows the substitution table.
// It is obtained by taking the first appearance of each letter in
// "eljuxhpwnyrdgtqkviszcfmabo".

// Explanation : You are given the strings key and message, which represent a
// cipher key and a secret message, respectively. The steps to decode message
// are as follows:
// Use the first appearance of all 26 lowercase English letters in key as the
// order of the substitution table.
// Align the substitution table with the regular English alphabet.
// Each letter in message is then substituted using the table.
// Spaces ' ' are transformed to themselves.
// For example, given key = "happy boy" (actual key would have at least one
// instance of each letter in the alphabet), we have the partial substitution
// table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' ->
// 'f').
// Return the decoded message.