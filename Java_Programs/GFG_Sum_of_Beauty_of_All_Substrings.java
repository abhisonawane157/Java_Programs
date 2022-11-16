
// GFG_Sum_of_Beauty_of_All_Substrings : https://practice.geeksforgeeks.org/problems/sum-of-beauty-of-all-substrings-1662962118/1
public class GFG_Sum_of_Beauty_of_All_Substrings {
    public static int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            ans += getBeauty(i, s, n);
        }
        return ans;
    }

    public static int getBeauty(int st, String s, int n) {
        int mem[] = new int[26];
        int ans = 0;
        for (int i = st; i < n; i++) {
            char ch = s.charAt(i);
            mem[ch - 'a']++;
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = 0; j < 26; j++) {
                if (mem[j] > 0) {
                    if (min > mem[j])
                        min = mem[j];
                    if (max < mem[j])
                        max = mem[j];
                }
            }
            ans += max - min;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        // String s = "aaac";
        int ans = beautySum(s);
        System.out.println(ans);
    }
}

// Output
// Input:
// S = "aaac"
// Output:
// 3
// Explanation: The substrings with non - zero beauty are ["aaac","aac"] where
// beauty of "aaac" is 2 and beauty of "aac" is 1.

// Input:
// S = "geeksforgeeks"
// Output:
// 62

// Explanation : Given a string S, return the sum of beauty of all its
// substrings.
// The beauty of a string is defined as the difference in frequencies between
// the most frequent and least frequent characters.

// For example, the beauty of string "aaac" is 3 - 1 = 2.