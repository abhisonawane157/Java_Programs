
// Save Your Life : https://practice.geeksforgeeks.org/problems/save-your-life4601/1
import java.util.*;

class GFG_Save_Your_Life {
    static String maxSum(String w, char x[], int b[], int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            map.put(x[i], b[i]);
        }
        int[] arr = new int[w.length()];
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if (map.containsKey(ch)) {
                arr[i] = map.get(ch);
            } else {
                int k = (int) ch;
                arr[i] = k;

            }
        }
        int ans = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (ans < sum) {
                start = idx;
                end = i;
                ans = sum;
            }
            if (sum < 0) {
                sum = 0;
                idx = i + 1;
            }
        }
        return w.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String w = "dbfbsdbf";
        char x[] = { 'b', 's' };
        int[] b = { -100, 45 };
        int n = x.length;
        String ans = maxSum(w, x, b, n);
        System.out.println(ans);
    }
}

// Output
// Input:
// W = abcde
// N = 1
// X[] = { 'c' }
// B[] = { -1000 }
// Output:
// de
// Explanation:
// Substring "de" has the
// maximum sum of ascii value,
// including c decreases the sum value

// Input:
// W = dbfbsdbf
// N = 2
// X[] = { 'b','s' }
// B[] = { -100, 45 }
// Output:
// dbfbsdbf
// Explanation:
// Substring "dbfbsdbf" has the maximum
// sum of ascii value.

// Explanation : Given a string w, integer array b, character array x and an
// integer n. n is the size of array b and array x. Find a substring which has
// the sum of the ASCII values of its every character, as maximum. ASCII values
// of some characters are redefined.
// Note: Uppercase & lowercase both will be present in the string w. Array b and
// Array x contain corresponding redefined ASCII values. For each i, b[i]
// contain redefined ASCII value of character x[i].