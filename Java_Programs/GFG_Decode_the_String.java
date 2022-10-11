
// Decode the string : https://practice.geeksforgeeks.org/problems/decode-the-string2444/1
import java.util.*;

public class GFG_Decode_the_String {

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

// Explanation : An encoded string (s) is given, the task is to decode it. The
// encoding pattern is that the occurance of the string is given at the starting
// of the string and each string is enclosed by square brackets.