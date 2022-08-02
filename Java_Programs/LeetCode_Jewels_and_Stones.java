
// 771. Jewels and Stones : https://leetcode.com/problems/jewels-and-stones/
import java.util.*;

public class LeetCode_Jewels_and_Stones {

    static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            if (maps.containsKey(stones.charAt(i))) {
                maps.put(stones.charAt(i), 1 + maps.get(stones.charAt(i)));
            } else {
                maps.put(stones.charAt(i), 1);
            }
        }
        int sum = 0;
        for (int i = 0; i < jewels.length(); i++) {
            if (maps.containsKey(jewels.charAt(i))) {
                sum = sum + maps.get(jewels.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String jewels = "z";
        String stones = "aAAbbbb";
        int ans = numJewelsInStones(jewels, stones);
        System.out.println(ans);
    }
}

// Output
// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3

// Input: jewels = "z", stones = "ZZ"
// Output: 0

// Exxplanation: You're given strings jewels representing the types of stones
// that are jewels, and stones representing the stones you have. Each character
// in stones is a type of stone you have. You want to know how many of the
// stones you have are also jewels.
// Letters are case sensitive, so "a" is considered a different type of stone
// from "A".