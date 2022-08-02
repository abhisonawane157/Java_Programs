
// 2138. Divide a String Into Groups of Size k : https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
import java.util.*;

public class LeetCode_Divide_a_String_Into_Groups_of_Size_K {
    static String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        int r = k, p = 0;
        String g = "";
        while (r > 0 && p < s.length()) {
            g = g + s.charAt(p);
            if (r == 1) {
                r = k + 1;
                list.add(g);
                g = "";
            }
            p++;
            r--;
        }
        if (s.length() % k != 0) {
            String su = "";
            for (int i = 0; i < k - (s.length() % k); i++) {
                su = su + fill;
            }
            String pre = "";
            int po = (s.length()) - (s.length() % k);
            for (int i = po; i < s.length(); i++) {
                pre = pre + s.charAt(i);
            }
            System.out.println(pre + " " + su);
            list.add(pre + "" + su);
        }
        String[] fin = new String[list.size()];
        for (int i = 0; i < fin.length; i++) {
            fin[i] = list.get(i);
        }
        return fin;
    }

    public static void main(String[] args) {
        String str = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] ans = divideString(str, k, fill);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

// Output
// Input: s = "abcdefghi", k = 3, fill = "x"
// Output: ["abc","def","ghi"]
// Explanation:
// The first 3 characters "abc" form the first group.
// The next 3 characters "def" form the second group.
// The last 3 characters "ghi" form the third group.
// Since all groups can be completely filled by characters from the string, we
// do not need to use fill.
// Thus, the groups formed are "abc", "def", and "ghi".

// Input: s = "abcdefghij", k = 3, fill = "x"
// Output: ["abc","def","ghi","jxx"]
// Explanation:
// Similar to the previous example, we are forming the first three groups "abc",
// "def", and "ghi".
// For the last group, we can only use the character 'j' from the string. To
// complete this group, we add 'x' twice.
// Thus, the 4 groups formed are "abc", "def", "ghi", and "jxx".

// Explanation : A string s can be partitioned into groups of size k using the
// following procedure:

// The first group consists of the first k characters of the string, the second
// group consists of the next k characters of the string, and so on. Each
// character can be a part of exactly one group.
// For the last group, if the string does not have k characters remaining, a
// character fill is used to complete the group.
// Note that the partition is done so that after removing the fill character
// from the last group (if it exists) and concatenating all the groups in order,
// the resultant string should be s.

// Given the string s, the size of each group k and the character fill, return a
// string array denoting the composition of every group s has been divided into,
// using the above procedure.