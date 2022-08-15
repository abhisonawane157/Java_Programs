
// 804. Unique Morse Code Words : https://leetcode.com/problems/unique-morse-code-words/
import java.util.*;

public class LeetCode_Unique_Morse_Code_Words {
    static int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> maps = mapsSet();
        HashSet<String> sets = new HashSet<>();
        String morse = "";
        for (String word : words) {
            morse = "";
            for (int j = 0; j < word.length(); j++) {
                morse = morse + maps.get(word.charAt(j));
            }
            sets.add(morse);
        }
        return sets.size();
    }

    static HashMap<Character, String> mapsSet() {
        HashMap<Character, String> maps = new HashMap<>();
        maps.put('a', ".-");
        maps.put('b', "-...");
        maps.put('c', "-.-.");
        maps.put('d', "-..");
        maps.put('e', ".");
        maps.put('f', "..-.");
        maps.put('g', "--.");
        maps.put('h', "....");
        maps.put('i', "..");
        maps.put('j', ".---");
        maps.put('k', "-.-");
        maps.put('l', ".-..");
        maps.put('m', "--");
        maps.put('n', "-.");
        maps.put('o', "---");
        maps.put('p', ".--.");
        maps.put('q', "--.-");
        maps.put('r', ".-.");
        maps.put('s', "...");
        maps.put('t', "-");
        maps.put('u', "..-");
        maps.put('v', "...-");
        maps.put('w', ".--");
        maps.put('x', "-..-");
        maps.put('y', "-.--");
        maps.put('z', "--..");

        return maps;
    }

    public static void main(String[] args) {
        String[] words = { "gin", "zen", "gig", "msg" };
        int ans = uniqueMorseRepresentations(words);
        System.out.println(ans);
    }
}

// Output
// Input: words = ["gin","zen","gig","msg"]
// Output: 2
// Explanation: The transformation of each word is:
// "gin" -> "--...-."
// "zen" -> "--...-."
// "gig" -> "--...--."
// "msg" -> "--...--."
// There are 2 different transformations: "--...-." and "--...--.".

// Input: words = ["a"]
// Output: 1

// Explanation : International Morse Code defines a standard encoding where each
// letter is mapped to a series of dots and dashes, as follows:
// 'a' maps to ".-",
// 'b' maps to "-...",
// 'c' maps to "-.-.", and so on.
// For convenience, the full table for the 26 letters of the English alphabet is
// given below:
// [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
// Given an array of strings words where each word can be written as a
// concatenation of the Morse code of each letter.
// For example, "cab" can be written as "-.-..--...", which is the concatenation
// of "-.-.", ".-", and "-...". We will call such a concatenation the
// transformation of a word.
// Return the number of different transformations among all words we have.