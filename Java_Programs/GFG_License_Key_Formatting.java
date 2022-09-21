
// License Key Formatting : https://practice.geeksforgeeks.org/problems/license-key-formatting/1

class GFG_License_Key_Formatting {
    static String ReFormatString(String S, int K) {
        // code here
        int count = 0;
        StringBuilder stb = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '-') {

            } else if (count == K) {
                stb.append("-");
                stb.append(String.valueOf(S.charAt(i)).toUpperCase());
                count = 1;
            } else {
                count++;
                stb.append(String.valueOf(S.charAt(i)).toUpperCase());
            }
        }
        return stb.reverse().toString();
    }

    public static void main(String[] args) {
        String S = "2-5g-3-j";
        // String S = "5F3Z-2e-9-w";
        int K = 2;
        String ans = ReFormatString(S, K);
        System.out.println(ans);
    }
}

// Output
// Input:
// S = "5F3Z-2e-9-w", K = 4
// Output: "5F3Z-2E9W"
// Explanation: The string S has been split into two
// parts, each part has 4 characters. Note that two
// extra dashes are not needed and can be removed.

// Input:
// S = "2-5g-3-J", K = 2
// Output: "2-5G-3J"
// Explanation: The string s has been split
// into three parts, each part has 2 characters
// except the first part as it could
// be shorter as mentioned above.

// Explanation : Given a string S that consists of only alphanumeric characters
// and dashes. The string is separated into N + 1 groups by N dashes. Also given
// an integer K.
// We want to reformat the string S, such that each group contains exactly K
// characters, except for the first group, which could be shorter than K but
// still must contain at least one character. Furthermore, there must be a dash
// inserted between two groups, and you should convert all lowercase letters to
// uppercase.
// Return the reformatted string.