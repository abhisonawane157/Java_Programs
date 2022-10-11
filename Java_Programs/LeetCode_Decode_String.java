// 394. Decode String : https://leetcode.com/problems/decode-string/description/

import java.util.*;

public class LeetCode_Decode_String {
    static String decodedString(String S) {
        // code here
        String CurrString = "";
        int CurrNum = 0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '[') {
                stack.push(Integer.toString(CurrNum));
                stack.push(CurrString);
                CurrString = "";
                CurrNum = 0;
            } else if (S.charAt(i) == ']') {
                String popString = stack.pop();
                int N = Integer.parseInt(stack.pop());
                String str = "";
                for (int j = 0; j < N; j++) {
                    str += CurrString;
                }
                CurrString = popString + str;
            } else if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                CurrNum = CurrNum * 10 + Character.getNumericValue(S.charAt(i));
            } else {
                CurrString += S.charAt(i);
            }
        }
        return CurrString;
    }

    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        // String s = "3[a]2[bc]";
        String ans = decodedString(s);
        System.out.println(ans);
    }
}

// Output
// Input: s = 1[b]
// Output: b
// Explaination: 'b' is present only one time.

// Input: s = 3[b2[ca]]
// Output: bcacabcacabcaca
// Explaination: 2[ca] means 'ca' is repeated
// twice which is 'caca' which concatenated with
// 'b' becomes 'bcaca'. This string repeated
// thrice becomes the output.

// Input: s = "3[a]2[bc]"
// Output: "aaabcbc"

// Input: s = "3[a2[c]]"
// Output: "accaccacc"

// Input: s = "2[abc]3[cd]ef"
// Output: "abcabccdcdcdef"

// Explanation : Given an encoded string, return its decoded string.

// The encoding rule is: k[encoded_string], where the encoded_string inside the
// square brackets is being repeated exactly k times. Note that k is guaranteed
// to be a positive integer.
// You may assume that the input string is always valid; there are no extra
// white spaces, square brackets are well-formed, etc. Furthermore, you may
// assume that the original data does not contain any digits and that digits are
// only for those repeat numbers, k. For example, there will not be input like
// 3a or 2[4].
// The test cases are generated so that the length of the output will never
// exceed 10^5.