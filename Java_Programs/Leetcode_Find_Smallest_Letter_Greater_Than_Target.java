
// 744. Find Smallest Letter Greater Than Target : https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Leetcode_Find_Smallest_Letter_Greater_Than_Target {
    static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i])
                return letters[i];
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] nums1 = { 'a', 'b' };
        char target = 'z';
        char ans = nextGreatestLetter(nums1, target);
        System.out.println(ans);
    }
}

// Output
// Input: letters = ["c","f","j"], target = "a"
// Output: "c"

// Input: letters = ["c","f","j"], target = "c"
// Output: "f"

// Input: letters = ["c","f","j"], target = "d"
// Output: "f"

// Explanation : Given a characters array letters that is sorted in
// non-decreasing order and a character target, return the smallest character in
// the array that is larger than target.
// Note that the letters wrap around.
// For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.